package com.liweijie.router.base.entity;


import com.liweijie.router.base.entity.imp.IProvider;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class SignProvider {
    private String key;
    private IProvider provider;

    public SignProvider(String key, IProvider provider) {
        this.key = key;
        this.provider = provider;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public IProvider getProvider() {
        return provider;
    }

    public void setProvider(IProvider provider) {
        this.provider = provider;
    }
}
