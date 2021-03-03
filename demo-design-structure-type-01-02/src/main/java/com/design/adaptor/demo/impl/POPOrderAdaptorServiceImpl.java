package com.design.adaptor.demo.impl;

import com.design.adaptor.demo.OrderAdaptorService;
import com.design.adaptor.demo.service.POPOrderService;

/**
 * @author qinhuajiao
 * @date 2021年03月03日 10:53:18
 */
public class POPOrderAdaptorServiceImpl implements OrderAdaptorService {

    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
