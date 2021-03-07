package com.design.adaptor.demo.mq;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月03日 09:43:03
 */
public class POPOrderDelivered {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 商品
     */
    private String  sku;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 金额
     */
    private BigDecimal decimal;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
