package com.design.adaptor.demo.impl;

import com.design.adaptor.demo.OrderAdapterService;
import com.design.adaptor.demo.service.OrderService;

/**
 * @author Jack House
 * @date 2021年03月03日 10:50:54
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
