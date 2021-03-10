package com.design.chain.of.responsibility.demo.test;

import com.alibaba.fastjson.JSON;
import com.design.chain.of.responsibility.demo.AuthController;
import com.design.chain.of.responsibility.demo.AuthService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月10日 14:11:16
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_AuthController() throws ParseException {
        AuthController authController = new AuthController();

        // 模拟三级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("Jack", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟三级负责人审批，张三");
        AuthService.auth("1000013", "1000998004813441");

        // 模拟二级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("Jack", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟二级负责人审批，李四");
        AuthService.auth("1000012", "1000998004813441");

        // 模拟一级负责人审批
        logger.info("测试结果：{}", JSON.toJSONString(authController.doAuth("Jack", "1000998004813441", new Date())));
        logger.info("测试结果：{}", "模拟一级负责人审批，王五");
        AuthService.auth("1000011", "1000998004813441");

        logger.info("测试结果：{}", "审批完成");
    }
}
