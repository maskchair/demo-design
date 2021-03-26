package com.design.visitor.demo.visitor.impl;

import com.design.visitor.demo.user.impl.Student;
import com.design.visitor.demo.user.impl.Teacher;
import com.design.visitor.demo.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 校长
 * @author Jack House
 * @date 2021年03月26日 10:48:42
 */
public class Principal implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Principal.class);

    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{}", student.name, student.clazz);
    }

    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }

}
