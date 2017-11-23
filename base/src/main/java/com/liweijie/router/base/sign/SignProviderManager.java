package com.liweijie.router.base.sign;

import com.liweijie.router.base.module.IModule1Provider;
import com.liweijie.router.base.module.IModule2Provider;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public final class SignProviderManager {

    private SignProviderManager() {

    }

    private static class SignProviderManagerHolder {
        private static final SignProviderManager INSTANCE = new SignProviderManager();
    }

    public static SignProviderManager getManager() {
        return SignProviderManagerHolder.INSTANCE;
    }

    private IModule1Provider module1Provider;

    private IModule2Provider module2Provider;

    public boolean hasModule1() {
        return getModule1Provider() != null;
    }

    public IModule1Provider getModule1Provider() {
        if (module1Provider == null) {
            module1Provider = (IModule1Provider) SignRouterManager.getRouter().getProvider("router/module1/provider");
        }
        return module1Provider;
    }

    public boolean hasModule2() {
        return getModule2Provider() != null;
    }

    public IModule2Provider getModule2Provider() {
        if (module2Provider == null) {
            module2Provider = (IModule2Provider) SignRouterManager.getRouter().getProvider("router/module2/provider");
        }
        return module2Provider;
    }
}
