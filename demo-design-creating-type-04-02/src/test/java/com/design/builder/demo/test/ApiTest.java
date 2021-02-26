package com.design.builder.demo.test;

import com.design.builder.demo.Builder;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author qinhuajiao
 * @date 2021年02月26日 16:37:49
 */
public class ApiTest {

    @Test
    public void test_Builder() {
        Builder builder = new Builder();

        //豪华欧式
        System.out.println(builder.levelOne(135.66D).getDetail());
        //轻奢田园
        System.out.println(builder.levelTwo(98.32D).getDetail());
        //现代简约
        System.out.println(builder.levelThree(88.52D).getDetail());
    }
}
