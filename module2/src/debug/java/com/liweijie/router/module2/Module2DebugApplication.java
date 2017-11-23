package com.liweijie.router.module2;

import android.app.Application;

import com.liweijie.router.base.entity.SignPath;
import com.liweijie.router.base.entity.SignProvider;
import com.liweijie.router.base.sign.SignRouterManager;
import com.liweijie.router.module2.provider.Module2ProviderImp;

/**
 * 作者：黎伟杰-子然 on 2017/11/24.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class Module2DebugApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initSignRouter();
    }

    private void initSignRouter() {
        //这些path当然你应该定义为常量存放在底层，这里只是单纯的方便
        SignRouterManager.getRouter().init(
                new SignPath("router/module2/page1", Module2Activity1.class),
                new SignPath("router/module2/page2", Module2Activity2.class)
        );

        SignRouterManager.getRouter().init(
                new SignProvider("router/module2/provider", new Module2ProviderImp()));

    }
}
