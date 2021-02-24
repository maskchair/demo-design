package com.design.factory.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.design.factory.demo.goods.DeliverReq;
import com.design.factory.demo.goods.GoodsService;
import com.design.factory.demo.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author qinhuajiao
 * @date 2021年02月24日 10:51:06
 */
public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[实物商品] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[实物商品]：{}", isSuccess);
    }

    private String queryUserName(String uId) { return "王五"; }

    private String queryUserPhoneNumber(String uId) { return "18556417294";}
}
