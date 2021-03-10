package com.design.chain.of.responsibility.demo.cuisine.impl;

import com.design.chain.of.responsibility.demo.AuthInfo;
import com.design.chain.of.responsibility.demo.AuthLink;
import com.design.chain.of.responsibility.demo.AuthService;

import java.text.ParseException;
import java.util.Date;

/**
 * 二级负责人
 * @author Jack House
 * @date 2021年03月10日 11:15:44
 */
public class Level2AuthLink extends AuthLink {

    private Date beginDate = format.parse("2021-03-10 00:00:00");

    private Date endDate = format.parse("2021-03-19 23:59:59");

    public Level2AuthLink(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {
        Date date = AuthService.queryAuthInfo(levelUserId, orderId);
        if (null == date) {
            return new AuthInfo("0001", "单号：", orderId, "状态：待二级审批负责人", levelUserName);
        }
        AuthLink next = super.next();
        if (null == next) {
            return new AuthInfo("0000", "单号：", orderId, "状态：二级审批完成负责人", "时间：", format.format(date), "审批人：", levelUserName);
        }
        if(authDate.before(beginDate) || authDate.after(endDate)) {
            return new AuthInfo("0000", "单号：", orderId, "状态：二级审批完成负责人", "时间：", format.format(date),"审批人：", levelUserName);
        }
        return next.doAuth(uId, orderId, authDate);
    }
}
