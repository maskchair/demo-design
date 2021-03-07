package com.design.factory.demo.coupon;

/**
 * 模拟优惠券服务类
 * @author Jack House
 * @date 2021年02月23日 14:37:00
 */
public class CouponService {

    public CouponResult setCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
