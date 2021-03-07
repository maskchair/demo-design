package com.design.abstractfactory.demo;

import java.util.concurrent.TimeUnit;

/**
 * @author Jack House
 * @date 2021年02月25日 10:57:49
 */
public interface CasheService {

    /**
     * 获取value
     * @param key
     * @param redisType
     * @return
     */
    String get(final String key, int redisType);

    /**
     * 设置Redis
     * @param key
     * @param redisType
     * @param value
     */
    void set(String key, String value, int redisType);

    /**
     * 设置Redis
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     * @param redisType
     */
    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    /**
     * 删除Redis设置
     * @param key
     * @param redisType
     */
    void del(String key, int redisType);
}
