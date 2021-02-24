package com.design.factory.demo;

import com.design.factory.demo.service.ICommodity;
import com.design.factory.demo.service.impl.CardCommodityService;
import com.design.factory.demo.service.impl.CouponCommodityService;
import com.design.factory.demo.service.impl.GoodsCommodityService;

/**
 * 工厂模式
 * @author qinhuajiao
 * @date 2021年02月24日 10:30:07
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        } else if (2 == commodityType) {
            return new GoodsCommodityService();
        } else if (3 == commodityType) {
            return new CardCommodityService();
        } else {
            throw  new RuntimeException("不存在的商品服务类型");
        }
    }

}
