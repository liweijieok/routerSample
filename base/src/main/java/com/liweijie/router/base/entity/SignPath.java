package com.liweijie.router.base.entity;

import android.app.Activity;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class SignPath {
    private String key;
    private Class<? extends Activity> path;

    public SignPath(String key, Class<? extends Activity> path) {
        this.key = key;
        this.path = path;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Class<? extends Activity> getPath() {
        return path;
    }

    public void setPath(Class<? extends Activity> path) {
        this.path = path;
    }
}
