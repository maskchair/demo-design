package com.design.chain.of.responsibility.demo.cuisine.impl;

import com.design.chain.of.responsibility.demo.AuthInfo;
import com.design.chain.of.responsibility.demo.AuthLink;
import com.design.chain.of.responsibility.demo.AuthService;

import java.util.Date;

/**
 * 一级责任人
 * @author Jack House
 * @date 2021年03月10日 11:15:26
 */
public class Level1AuthLink extends AuthLink {

    public Level1AuthLink(String levelUserId, String levelUserName) {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, "状态：待一级审批负责人", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, "状态：一级审批完成责任人", "时间：", format.format(date), "审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }

}
