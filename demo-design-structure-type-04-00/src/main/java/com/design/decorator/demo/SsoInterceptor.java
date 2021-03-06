package com.design.decorator.demo;

/**
 * @author qinhuajiao
 * @date 2021年03月06日 21:12:43
 */
public class SsoInterceptor implements  HandlerInterceptor {


    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        return ticket.equals("success");
    }
}
