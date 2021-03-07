package com.design.adaptor.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.design.adaptor.demo.mq.OrderMq;

/**
 * @author Jack House
 * @date 2021年03月03日 10:14:37
 */
public class OrderMqService {

    public void onMessage(String message) {
        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        //处理业务
    }
}
