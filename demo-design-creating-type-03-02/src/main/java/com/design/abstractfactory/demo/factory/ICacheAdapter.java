package com.design.abstractfactory.demo.factory;

import java.util.concurrent.TimeUnit;

/**
 * @author qinhuajiao
 * @date 2021年02月25日 15:31:57
 */
public interface ICacheAdapter {

    /**
     * 获取value
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 设置Redis
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 设置Redis
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit);

    /**
     * 删除Redis设置
     * @param key
     */
    void del(String key);

}
