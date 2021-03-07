package com.design.decorator.demo.test;

import com.design.decorator.demo.LoginSsoDecorator;
import com.design.decorator.demo.SsoInterceptor;
import org.junit.Test;

/**
 * @author qinhuajiao
 * @date 2021年03月06日 21:39:46
 */
public class ApiTest {

    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator(new SsoInterceptor());
        String request = "1successhahhaha";
        boolean success = ssoDecorator.preHandle(request, "3532fsdfgh4fgdf", "t");

        System.out.println("登录校验：" + request + (success ? "放行" : "拦截"));
    }
}