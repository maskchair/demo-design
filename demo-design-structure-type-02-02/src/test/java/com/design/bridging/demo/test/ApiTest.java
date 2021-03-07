package com.design.bridging.demo.test;

import com.design.bridging.demo.channel.WxPay;
import com.design.bridging.demo.channel.ZfbPay;
import com.design.bridging.demo.mode.PayFaceMode;
import com.design.bridging.demo.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author Jack House
 * @date 2021年03月04日 08:10:33
 */
public class ApiTest {

    @Test
    public void test_pay() {


        System.out.println("\r\n模拟测试场景，微信支付、指纹方式。");
        WxPay wxPaypay = new WxPay(new PayFingerprintMode());
        wxPaypay.transfer("weixin_dagds253vs2dd2","48512316581", new BigDecimal(50));

        System.out.println("\r\n模拟测试场景，支付宝支付、人脸方式。");
        ZfbPay zfbPay = new ZfbPay(new PayFaceMode());
        zfbPay.transfer("gfh32d3fg5gs13","3213125454677912", new BigDecimal(50));
    }
}
