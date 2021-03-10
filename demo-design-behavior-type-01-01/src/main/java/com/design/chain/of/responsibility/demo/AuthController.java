package com.design.chain.of.responsibility.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月10日 10:56:02
 */
public class AuthController {

    /**
     * 时间格式化
     */
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM=dd HH:mm:ss");

    public AuthInfo doAuth(String uId, String orderId, Date authDate) throws ParseException {

        // 三级审批
        Date date = AuthService.queryAuthInfo("100003", orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, "状态：待三级审批负责人", "张三");
        }

        // 二级审批
        if (authDate.after(format.parse("2021-03-01 00:00:00")) && authDate.before(format.parse("2021-03-25 23:59:59"))) {
            date = AuthService.queryAuthInfo("100002", orderId);
            if (null == date) {
                return new AuthInfo("0001","单号：", orderId, "状态：待二级审批负责人", "李四");
            }
        }

        // 一级审批
        if (authDate.after(format.parse("2021-03-10 00:00:00")) && authDate.before(format.parse("2020-03-19 23:59:59"))) {
            date = AuthService.queryAuthInfo("100003",  orderId);
            if(null == date) {
                return new AuthInfo("0001", "单号：", orderId, "状态：待一级审批负责人", "王五");
            }
        }

        return new AuthInfo("0001", "单号：", orderId, "状态：审批完成");
    }

}
