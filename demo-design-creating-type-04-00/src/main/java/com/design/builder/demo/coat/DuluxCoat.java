package com.design.builder.demo.coat;

import com.design.builder.demo.Matter;

import java.math.BigDecimal;

/**
 * 涂料
 * 品牌；多乐士(Dulux)
 * @author qinhuajiao
 * @date 2021年02月26日 14:34:48
 */
public class DuluxCoat implements Matter {

    public String scene() {
        return "涂料";
    }

    public String brand() {
        return "多乐士(Dulux)";
    }

    public String model() {
        return "第二代";
    }

    public BigDecimal price() {
        return new BigDecimal(719);
    }

    public String desc() {
        return "多乐士是阿克苏诺贝尔旗下的注明建筑装饰油漆品牌，产品畅销于全球100个国家，每年全球有5000万户家庭使用多乐士油漆。";
    }
}