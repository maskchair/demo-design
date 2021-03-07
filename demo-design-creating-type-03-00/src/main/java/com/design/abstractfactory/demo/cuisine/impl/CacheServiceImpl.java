package com.design.abstractfactory.demo.cuisine.impl;

import com.design.abstractfactory.demo.CacheService;
import com.design.abstractfactory.demo.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author Jack House
 * @date 2021年02月25日 10:52:54
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
