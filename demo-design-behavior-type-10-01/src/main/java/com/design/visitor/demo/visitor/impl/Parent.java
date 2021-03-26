package com.design.visitor.demo.visitor.impl;

import com.design.visitor.demo.user.impl.Student;
import com.design.visitor.demo.user.impl.Teacher;
import com.design.visitor.demo.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 家长
 * @author Jack House
 * @date 2021年03月26日 10:44:44
 */
public class Parent implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Parent.class);

    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }
}
