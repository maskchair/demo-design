package com.design.visitor.demo.user.impl;

import com.design.visitor.demo.user.User;
import com.design.visitor.demo.visitor.Visitor;

/**
 * 学生
 * @author Jack House
 * @date 2021年03月26日 10:36:06
 */
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
