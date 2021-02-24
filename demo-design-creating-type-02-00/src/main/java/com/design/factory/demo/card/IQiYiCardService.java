package com.design.factory.demo.card;

/**
 * 模拟爱奇艺会员卡服务
 * @author qinhuajiao
 * @date 2021年02月23日 14:29:36
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
