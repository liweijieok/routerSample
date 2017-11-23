package com.liweijie.router.module2.provider;

import com.liweijie.router.base.module.IModule2Provider;
import com.liweijie.router.module2.TestUtil;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class Module2ProviderImp implements IModule2Provider {

    @Override
    public String test() {
        return TestUtil.test();
    }
}
