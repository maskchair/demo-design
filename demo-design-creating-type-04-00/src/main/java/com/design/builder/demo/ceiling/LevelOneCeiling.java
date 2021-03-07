package com.design.builder.demo.ceiling;

import com.design.builder.demo.Matter;

import java.math.BigDecimal;

/**
 * 吊顶
 * 品牌；装修公司自带
 * 型号：一级顶
 * @author Jack House
 * @date 2021年02月26日 14:27:25
 */
public class LevelOneCeiling implements Matter {

    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "自带装修公司";
    }

    public String model() {
        return "一级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(260);
    }

    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般高顶120-150mm";
    }
}
