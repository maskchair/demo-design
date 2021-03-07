package com.design.abstractfactory.demo.impl;

import com.design.abstractfactory.demo.CacheService;
import com.design.abstractfactory.demo.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author Jack House
 * @date 2021年02月25日 15:24:07
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
