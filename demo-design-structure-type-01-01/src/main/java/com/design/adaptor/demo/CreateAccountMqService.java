package com.design.adaptor.demo;

import com.alibaba.fastjson.JSON;
import com.design.adaptor.demo.mq.CreateAccount;

/**
 * @author qinhuajiao
 * @date 2021年03月03日 10:10:36
 */
public class CreateAccountMqService {

    public void onMessage(String message) {
        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);

        mq.getNumber();
        mq.getAccountDate();

        //处理业务

    }
}
