package com.design.flyweight.demo;

import com.design.flyweight.demo.util.RedisUtils;

/**
 * @author Jack House
 * @date 2021年03月08日 09:16:59
 */
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {
        Activity activity = ActivityFactory.getActivity(id);
        // 模拟从Redis中获取库存变化信息
        Stock stock = new Stock(1000, redisUtils.getStockUsed());
        activity.setStock(stock);
        return activity;
    }

}
