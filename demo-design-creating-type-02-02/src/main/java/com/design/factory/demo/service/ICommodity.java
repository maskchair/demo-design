package com.design.factory.demo.service;

import java.util.Map;

/**
 * @author Jack House
 * @date 2021年02月24日 10:31:40
 */
public interface ICommodity {

    /**
     *
     * @param uId
     * @param commodityId
     * @param bizId
     * @param extMap
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
