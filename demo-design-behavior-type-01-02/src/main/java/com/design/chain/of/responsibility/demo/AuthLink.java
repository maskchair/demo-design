package com.design.chain.of.responsibility.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月10日 10:59:41
 */
public abstract class AuthLink {

    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    /**
     * 时间格式化
     */
    protected SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 级别人员ID
     */
    protected String levelUserId;

    /**
     * 级别人员姓名
     */
    protected String levelUserName;

    /**
     * 责任链
     */
    private AuthLink next;

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }

    public AuthLink next() {return next;}

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }

    /**
     * 审批
     * @param uId
     * @param orderId
     * @param authDate
     * @return
     */
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
