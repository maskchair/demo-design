package com.design.template.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * 基础电商推广服务
 * @author Jack House
 * @date 2021年03月25日 08:12:27
 * 1. 生成最优价商品海报
 */
public abstract class NetMall {

    protected Logger logger = LoggerFactory.getLogger(NetMall.class);

    /**
     * 用户ID
     */
    String uId;

    /**
     * 用户密码
     */
    String uPwd;

    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }

    public String generateGoodsPoster(String skuUrl) {
        // 1. 验证登录
        if (!login(uId, uPwd)) {
            return null;
        }
        // 2. 爬虫商品
        Map<String, String> reptile = reptile(skuUrl);

        // 3. 组装海报
        return createBase64(reptile);
    }

    /**
     * 模拟登录
     * @param uId
     * @param uPwd
     * @return
     */
    protected abstract Boolean login(String uId, String uPwd);

    /**
     * 爬虫提取商品信息（登录后的优惠价格）
     * @param skuUrl
     * @return
     */
    protected abstract Map<String, String> reptile(String skuUrl);

    /**
     * 生成商品海报信息
     * @param goodsInfo
     * @return
     */
    protected abstract String createBase64(Map<String, String> goodsInfo);
}
