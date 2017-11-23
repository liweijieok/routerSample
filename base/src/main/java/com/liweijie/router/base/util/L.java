package com.liweijie.router.base.util;

import android.text.TextUtils;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public final class L {

    private static final String TAG = "--router_sample--";

    private L() {
        throw new IllegalStateException("not allow init");
    }

    public static void e(String msg) {
        e(null, msg);
    }

    public static void e(String tag, Object... msg) {
        StringBuilder sb = new StringBuilder();
        if (msg != null && msg.length > 0) {
            for (Object item : msg) {
                sb.append(item.toString());
            }
        }
        if (!TextUtils.isEmpty(tag)) {
            L.e(TAG + tag, msg);
        } else {
            L.e(TAG + tag, msg);
        }

    }
}
