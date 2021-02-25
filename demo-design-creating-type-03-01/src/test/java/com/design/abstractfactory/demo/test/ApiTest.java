package com.design.abstractfactory.demo.test;

import com.design.abstractfactory.demo.CasheService;
import com.design.abstractfactory.demo.cuisine.impl.CasheServiceImpl;
import org.junit.Test;

/**
 * @author qinhuajiao
 * @date 2021年02月25日 11:37:24
 */
public class ApiTest {

    @Test
    public void test_cacheService() {
        CasheService casheService = new CasheServiceImpl();

        casheService.set("user001","张三", 1);
        String val01 = casheService.get("user001", 1);
        System.out.println("测试结果：" + val01);
    }
}
