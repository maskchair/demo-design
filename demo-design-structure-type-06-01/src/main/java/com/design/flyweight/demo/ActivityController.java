package com.design.flyweight.demo;

import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月08日 08:46:51
 */
public class ActivityController {

    public Activity queryActivityInfo(Long id) {
        // 模拟实际业务应用从接口中获取活动信息
        Activity activity = new Activity();
        activity.setId(10001L);
        activity.setName("图书嗨乐");
        activity.setDesc("图书优惠分享激励分享活动第三期");
        activity.setStartTime(new Date());
        activity.setStopTime(new Date());
        activity.setStock(new Stock(1000, 1));
        return activity;
    }

}
