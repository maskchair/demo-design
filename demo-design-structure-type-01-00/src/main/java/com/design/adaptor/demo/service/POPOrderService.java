package com.design.adaptor.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qinhuajiao
 * @date 2021年03月03日 09:58:55
 */
public class POPOrderService {

    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("POP商家，查询用户的订单是否为首单：{}", uId);
        return true;
    }
}
