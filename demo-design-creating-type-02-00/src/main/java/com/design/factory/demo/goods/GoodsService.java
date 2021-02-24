package com.design.factory.demo.goods;

import com.alibaba.fastjson.JSON;

/**
 *
 * @author qinhuajiao
 * @date 2021年02月23日 14:42:23
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
