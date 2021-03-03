package com.design.adaptor.demo;

/**
 * @author qinhuajiao
 * @date 2021年03月03日 10:24:10
 */
public interface OrderAdaptorService {

    /**
     * 是否首单
     * @param uId 用户ID
     * @return
     */
    boolean isFirst(String uId);

}
