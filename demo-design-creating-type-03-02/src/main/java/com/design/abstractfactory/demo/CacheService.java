package com.design.abstractfactory.demo;

import java.util.concurrent.TimeUnit;

/**
 * @author Jack House
 * @date 2021年02月25日 13:47:48
 */
public interface CacheService {

    /**
     * 获取值
     * @param key
     * @return
     */
    String get(final String key);

    /**
     * 设值
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 设值
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit);

    /**
     * 删除
     * @param key
     */
    void del(String key);
}
