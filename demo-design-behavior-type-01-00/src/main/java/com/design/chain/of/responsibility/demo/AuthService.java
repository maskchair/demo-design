package com.design.chain.of.responsibility.demo;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟审核服务
 * @author Jack House
 * @date 2021年03月10日 10:47:25
 */
public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<String, Date>();

    /**
     * 查询审核信息（时间）
     * @param uId
     * @param orderId
     * @return
     */
    public static Date queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    /**
     * 审核流程
     * @param uId
     * @param orderId
     */
    public static void auth(String uId, String orderId) {
        authMap.put(uId.concat(orderId), new Date());
    }

}
