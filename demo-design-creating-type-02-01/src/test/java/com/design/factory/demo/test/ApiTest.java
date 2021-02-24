package com.design.factory.demo.test;


import com.alibaba.fastjson.JSON;
import com.design.factory.demo.AwardReq;
import com.design.factory.demo.AwardRes;
import com.design.factory.demo.PrizeController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author qinhuajiao
 * @date 2021年02月24日 09:28:35
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_awardToUser(){
        PrizeController prizeController = new PrizeController();
        couponsTest(prizeController);
        goodsTest(prizeController);
        cardTest(prizeController);
    }

    private void couponsTest(PrizeController prizeController) {
        System.out.println("\r\n模拟发放优惠券测试\r\n");
        //模拟发放优惠券测试
        AwardReq req = new AwardReq();
        req.setuId("10001");
        req.setAwardType(1);
        req.setAwardNumber("EGM1023938910232121323432");
        req.setBizId("791098764902132");
        AwardRes awardRes = prizeController.awardToUser(req);

        logger.info("请求参数：{}", JSON.toJSON(req));
        logger.info("测试结果：{}", JSON.toJSON(awardRes));
    }

    private  void goodsTest(PrizeController prizeController) {
        System.out.println("\r\n模拟发放实物商品\r\n");
        //模拟发放实物商品
        AwardReq req = new AwardReq();
        req.setuId("10002");
        req.setAwardType(2);
        req.setAwardNumber("7841896412787");
        req.setBizId("4815241512354621310");
        req.setExtMap(new HashMap<String, String>(){{
            put("consigneeUserName", "李四");
            put("consigneeUserPhone", "15742138569");
            put("consigneeUserAddress", "浙江省.金华市.金东区.双龙洞");
        }});

        AwardRes awardRes = prizeController.awardToUser(req);
        logger.info("请求参数：{}", JSON.toJSON(req));
        logger.info("测试结果：{}", JSON.toJSON(awardRes));
    }

    private void cardTest(PrizeController prizeController) {
        System.out.println("\r\n模拟发放第三方兑换卡(爱奇艺)\r\n");
        //模拟发放第三方兑换卡(爱奇艺)
        AwardReq req = new AwardReq();
        req.setuId("10003");
        req.setAwardType(3);
        req.setAwardNumber("JHImfdsPfsa5das2A12E2d");

        AwardRes awardRes = prizeController.awardToUser(req);
        logger.info("请求参数：{}", JSON.toJSON(req));
        logger.info("测试结果：{}", JSON.toJSON(awardRes));
    }
}
