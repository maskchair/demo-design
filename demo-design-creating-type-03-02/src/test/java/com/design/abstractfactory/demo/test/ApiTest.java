package com.design.abstractfactory.demo.test;

import com.design.abstractfactory.demo.CacheService;
import com.design.abstractfactory.demo.factory.JDKProxy;
import com.design.abstractfactory.demo.factory.impl.EGMCacheAdapter;
import com.design.abstractfactory.demo.factory.impl.IIRCacheAdapter;
import com.design.abstractfactory.demo.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @author qinhuajiao
 * @date 2021年02月25日 15:50:01
 */
public class ApiTest {

    @Test
    public void test_cacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user0001", "张三");
        String val01 = proxy_EGM.get("user0001");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user0002", "李四");
        String val02 = proxy_IIR.get("user0002");
        System.out.println("测试结果：" + val02);
    }
}
