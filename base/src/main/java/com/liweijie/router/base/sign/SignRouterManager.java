package com.liweijie.router.base.sign;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.liweijie.router.base.entity.BunBuilder;
import com.liweijie.router.base.entity.SignPath;
import com.liweijie.router.base.entity.SignProvider;
import com.liweijie.router.base.entity.imp.IProvider;
import com.liweijie.router.base.util.L;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：黎伟杰-子然 on 2017/11/22.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public final class SignRouterManager {

    private Map<String, Class<? extends Activity>> mPaths;

    private Map<String, IProvider> mProviders;


    private SignRouterManager() {
        mPaths = new HashMap<>();
        mProviders = new HashMap<>();
    }

    private static class SignRouterManagerHolder {
        private static final SignRouterManager INSTANCE = new SignRouterManager();
    }


    public static SignRouterManager getRouter() {
        return SignRouterManagerHolder.INSTANCE;
    }

    /**
     * 初始化注册
     *
     * @param paths
     */
    public void init(SignPath... paths) {
        if (paths == null) {
            return;
        }
        for (SignPath path : paths) {
            mPaths.put(path.getKey(), path.getPath());
        }
    }

    public void init(SignProvider... providers) {
        if (providers == null || providers.length <= 0) {
            return;
        }
        for (SignProvider provider : providers) {
            mProviders.put(provider.getKey(), provider.getProvider());
        }
    }

    public void launch(Context context, String path) {
        launch(context, path, null);
    }

    public void launch(Activity context, String path, int requestCode) {
        launch(context, path, null, requestCode);
    }

    public void launch(Context context, String path, BunBuilder bunBuilder) {
        Intent launch = assemblyData(context, path, bunBuilder);
        if (launch == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            launch.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }
        context.startActivity(launch);
    }

    public void launch(Activity context, String path, BunBuilder bunBuilder, int requestCode) {
        Intent launch = assemblyData(context, path, bunBuilder);
        if (launch != null) {
            context.startActivityForResult(launch, requestCode);
        }
    }

    private Intent assemblyData(Context context, String path, BunBuilder bunBuilder) {
        if (context == null) {
            L.e("传入的Context为null");
            return null;
        }
        if (TextUtils.isEmpty(path)) {
            L.e("传入的Path是空，无法跳转");
            return null;
        }
        Class<? extends Activity> clazz = mPaths.get(path);
        if (clazz == null) {
            L.e("无法查找到该路径的页面");
            return null;
        }
        Intent launch = new Intent(context, clazz);
        if (bunBuilder != null) {
            launch.putExtras(bunBuilder.build());
        }
        return launch;
    }

    public IProvider getProvider(String path) {
        return mProviders.get(path);
    }

}
