package com.design.bridging.demo.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jack House
 * @date 2021年03月04日 08:44:00
 */
public class PayCypher implements IPayMode {

    private Logger logger = LoggerFactory.getLogger(PayCypher.class);


    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return true;
    }
}
