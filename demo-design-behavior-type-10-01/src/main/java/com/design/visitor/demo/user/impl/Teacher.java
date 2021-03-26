package com.design.visitor.demo.user.impl;

import com.design.visitor.demo.user.User;
import com.design.visitor.demo.visitor.Visitor;

import java.math.BigDecimal;

/**
 * 老师
 * @author Jack House
 * @date 2021年03月26日 10:36:20
 */
public class Teacher extends User {

    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 升本率
     * @return
     */
    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
