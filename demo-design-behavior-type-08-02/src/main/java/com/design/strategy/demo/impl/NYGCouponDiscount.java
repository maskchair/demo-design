package com.design.strategy.demo.impl;

import com.design.strategy.demo.ICouponDiscount;

import java.math.BigDecimal;

/**
 * @author Jack House
 * @date 2021年03月24日 21:16:52
 * n元购买
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }

}
