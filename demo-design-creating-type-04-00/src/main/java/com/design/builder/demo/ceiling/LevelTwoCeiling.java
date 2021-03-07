package com.design.builder.demo.ceiling;

import com.design.builder.demo.Matter;

import java.math.BigDecimal;

/**
 * 吊顶
 * 品牌；装修公司自带
 * 型号：二级顶
 * @author Jack House
 * @date 2021年02月26日 14:27:56
 */
public class LevelTwoCeiling implements Matter {

    public String scene() {
        return "吊顶";
    }

    public String brand() {
        return "自带装修公司";
    }

    public String model() {
        return "二级顶";
    }

    public BigDecimal price() {
        return new BigDecimal(850);
    }

    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层次很高，也可增加每级的厚度";
    }
}
