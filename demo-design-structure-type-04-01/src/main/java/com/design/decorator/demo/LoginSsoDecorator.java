package com.design.decorator.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Jack House
 * @date 2021年03月06日 21:27:18
 */
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> outhMap = new ConcurrentHashMap<String, String>();

    static {
        outhMap.put("zhangsan", "queryUserInfo");
        outhMap.put("lisi", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        boolean success = ticket.equals("success");

        if (!success) {
            return false;
        }

        String userId = request.substring(9);
        String method = outhMap.get(userId);

        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
