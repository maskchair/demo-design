package com.design.bridging.demo.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qinhuajiao
 * @date 2021年03月04日 08:46:01
 */
public class PayFingerprintMode implements IPayMode {

    private Logger logger = LoggerFactory.getLogger(PayFingerprintMode.class);


    public boolean security(String uId) {
        logger.info("指纹支付，风控检验指纹信息");
        return true;
    }
}
