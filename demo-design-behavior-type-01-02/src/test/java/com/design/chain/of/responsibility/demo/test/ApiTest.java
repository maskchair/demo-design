package com.design.chain.of.responsibility.demo.test;

import com.alibaba.fastjson.JSON;
import com.design.chain.of.responsibility.demo.AuthLink;
import com.design.chain.of.responsibility.demo.AuthService;
import com.design.chain.of.responsibility.demo.cuisine.impl.Level1AuthLink;
import com.design.chain.of.responsibility.demo.cuisine.impl.Level2AuthLink;
import com.design.chain.of.responsibility.demo.cuisine.impl.Level3AuthLink;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月10日 14:44:31
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_AuthLink() throws ParseException {
        AuthLink authLink = new Level3AuthLink("1000013", "张三")
                .appendNext(new Level2AuthLink("1000012", "李四")
                        .appendNext(new Level1AuthLink("1000011", "王五")));

        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("Jack", "1000998004813441", new Date())));

        // 模拟三级负责人审批
        AuthService.auth("1000013", "1000998004813441");
        logger.info("测试结果：{}", "模拟三级负责人审批，张三");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("Jack", "1000998004813441", new Date())));

        // 模拟二级负责人审批
        AuthService.auth("1000012", "1000998004813441");
        logger.info("测试结果：{}", "模拟二级负责人审批，李四");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("Jack", "1000998004813441", new Date())));

        // 模拟一级负责人审批
        AuthService.auth("1000011", "1000998004813441");
        logger.info("测试结果：{}", "模拟一级负责人审批，王五");
        logger.info("测试结果：{}", JSON.toJSONString(authLink.doAuth("Jack", "1000998004813441", new Date())));
    }

}
