package com.design.abstractfactory.demo.factory.impl;

import com.design.abstractfactory.demo.factory.ICacheAdapter;
import com.design.abstractfactory.demo.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @author qinhuajiao
 * @date 2021年02月25日 15:46:17
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
