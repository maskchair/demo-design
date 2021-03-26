package com.design.visitor.demo.user;

import com.design.visitor.demo.visitor.Visitor;

/**
 * 基础用户信息
 * @author Jack House
 * @date 2021年03月26日 10:28:01
 */
public abstract class User {

    /**
     * 姓名
     */
    public String name;

    /**
     * 身份：重点班、普通班 | 特级教师、普通教师、实习教师
     */
    public String identity;

    /**
     * 班级
     */
    public String clazz;

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    /**
     * 核心访问方法
     */
    public abstract void accept(Visitor visitor);
}
