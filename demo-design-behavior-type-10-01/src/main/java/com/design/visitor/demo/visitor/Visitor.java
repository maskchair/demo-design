package com.design.visitor.demo.visitor;

import com.design.visitor.demo.user.impl.Student;
import com.design.visitor.demo.user.impl.Teacher;

/**
 * @author Jack House
 * @date 2021年03月26日 10:33:55
 */
public interface Visitor {

    /**
     * 访问学生信息
     * @param student
     */
    void visit(Student student);

    /**
     * 访问老师信息
     * @param teacher
     */
    void visit(Teacher teacher);

}
