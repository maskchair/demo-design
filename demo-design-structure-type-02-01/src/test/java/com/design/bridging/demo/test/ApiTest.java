package com.design.bridging.demo.test;

import com.design.bridging.demo.PayController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author qinhuajiao
 * @date 2021年03月04日 08:10:23
 */
public class ApiTest {

    @Test
    public void test_pay() {
        PayController pay = new PayController();

        System.out.println("\r\n模拟测试场景，微信支付、指纹方式。");
        pay.doPay("weixin_dagds253vs2dd2","48512316581", new BigDecimal(50),1,3);

        System.out.println("\r\n模拟测试场景，支付宝支付、人脸方式。");
        pay.doPay("gfh32d3fg5gs13","3213125454677912", new BigDecimal(50), 2,2);
    }
}
