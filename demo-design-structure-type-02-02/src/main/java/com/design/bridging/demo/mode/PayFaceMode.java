package com.design.bridging.demo.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qinhuajiao
 * @date 2021年03月04日 08:45:43
 */
public class PayFaceMode implements IPayMode {

    private Logger logger = LoggerFactory.getLogger(PayFaceMode.class);


    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }
}
