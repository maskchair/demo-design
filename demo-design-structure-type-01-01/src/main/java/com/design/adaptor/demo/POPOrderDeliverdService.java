package com.design.adaptor.demo;

import com.alibaba.fastjson.JSON;
import com.design.adaptor.demo.mq.POPOrderDelivered;

/**
 * @author Jack House
 * @date 2021年03月03日 10:15:02
 */
public class POPOrderDeliverdService {

    public void onMessage(String message) {
        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        //处理业务
    }

}
