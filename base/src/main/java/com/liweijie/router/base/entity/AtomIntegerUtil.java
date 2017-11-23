package com.liweijie.router.base.entity;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：线程安全自增长int
 * update by:
 * update day:
 */
public final class AtomIntegerUtil {

    private AtomIntegerUtil() {
        throw new IllegalStateException("not allow init");
    }

    private static final AtomicInteger INTEGER = new AtomicInteger(1);

    public static int increment() {
        return INTEGER.getAndIncrement();
    }
}
