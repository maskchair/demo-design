package com.design.abstractfactory.demo.factory.impl;

import com.design.abstractfactory.demo.factory.ICacheAdapter;
import com.design.abstractfactory.demo.matter.EGM;

import java.util.concurrent.TimeUnit;

/**
 * @author Jack House
 * @date 2021年02月25日 15:43:05
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();


    public String get(String key) {
        return egm.gain(key);
    }

    public void set(String key, String value) {
        egm.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        egm.setEx(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        egm.delete(key);
    }
}
