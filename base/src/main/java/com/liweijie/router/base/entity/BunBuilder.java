package com.liweijie.router.base.entity;

import android.os.Bundle;

import java.io.Serializable;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description： 其他方法自己自行添加，示例，只是方便用来添加数据而已
 * update by:
 * update day:
 */
public class BunBuilder {
    private Bundle bundle;

    public BunBuilder() {
        this.bundle = new Bundle();
    }

    public BunBuilder put(String key, int value) {
        bundle.putInt(key, value);
        return this;
    }

    public BunBuilder put(String key, long value) {
        bundle.putLong(key, value);
        return this;
    }

    public BunBuilder put(String key, String value) {
        bundle.putString(key, value);
        return this;
    }

    public BunBuilder put(String key, Serializable value) {
        bundle.putSerializable(key, value);
        return this;
    }

    public Bundle build(){
        return bundle;
    }

}
