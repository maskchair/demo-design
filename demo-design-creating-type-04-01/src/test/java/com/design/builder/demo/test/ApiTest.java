package com.design.builder.demo.test;

import com.design.builder.demo.controller.DecorationPackageController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author qinhuajiao
 * @date 2021年02月26日 16:07:48
 */
public class ApiTest {

    @Test
    public void test_DecorationPackageController() {
        DecorationPackageController decorationPackageController = new DecorationPackageController();

        //豪华欧式
        System.out.println(decorationPackageController.getMatterList(new BigDecimal("135.66"), 1));
        //轻奢田园
        System.out.println(decorationPackageController.getMatterList(new BigDecimal("98.32"), 2));
        //现代简约
        System.out.println(decorationPackageController.getMatterList(new BigDecimal("88.52"), 3));
    }
}
