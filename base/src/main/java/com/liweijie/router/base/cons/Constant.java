package com.liweijie.router.base.cons;

import com.liweijie.router.base.entity.AtomIntegerUtil;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public interface Constant {

    String DATA = "data";
    String DATA1 = "data1";


    int MODULE2_REQUEST_CODE = AtomIntegerUtil.increment();
    int MODULE1_RESULT_CODE = AtomIntegerUtil.increment();

}
