package com.design.factory.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.design.factory.demo.coupon.CouponResult;
import com.design.factory.demo.coupon.CouponService;
import com.design.factory.demo.service.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author qinhuajiao
 * @date 2021年02月24日 10:50:41
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.setCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodity：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if(!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }
    }
}
