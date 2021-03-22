package com.design.observer.demo.test;

import com.alibaba.fastjson.JSON;
import com.design.observer.demo.LotteryResult;
import com.design.observer.demo.LotteryService;
import com.design.observer.demo.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jack House
 * @date 2021年03月22日 19:11:52
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.doDraw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }

}
