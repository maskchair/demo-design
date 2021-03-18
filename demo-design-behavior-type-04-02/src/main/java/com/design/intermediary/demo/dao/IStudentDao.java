package com.design.intermediary.demo.dao;

import com.design.intermediary.demo.module.Student;

import java.util.List;

/**
 * @author Jack House
 * @date 2021年03月16日 16:20:02
 */
public interface IStudentDao {

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    Student queryStudentById(Long id);

    /**
     * 根据年纪查询学生
     * @param age
     * @return
     */
    List<Student> queryStudentByAge(Integer age);

}
