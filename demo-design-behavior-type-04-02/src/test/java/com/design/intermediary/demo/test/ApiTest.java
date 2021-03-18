package com.design.intermediary.demo.test;

import com.alibaba.fastjson.JSON;
import com.design.intermediary.demo.mediator.Resources;
import com.design.intermediary.demo.mediator.SqlSession;
import com.design.intermediary.demo.mediator.SqlSessionFactory;
import com.design.intermediary.demo.mediator.SqlSessionFactoryBuilder;
import com.design.intermediary.demo.module.Student;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Reader;
import java.util.List;

/**
 * @author Jack House
 * @date 2021年03月16日 15:54:23
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void testQueryStudentById() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();

            try {
                Student student = session.selectOne("com.design.intermediary.demo.dao.IStudentDao.queryStudentById", 1L);
                logger.info("测试结果：{}", JSON.toJSONString(student));

            } finally {
                session.close();
                reader.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test_queryStudentByAge() {
        String resource = "mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();

            try {
                List<Student> students = session.selectList("com.design.intermediary.demo.dao.IStudentDao.queryStudentByAge", 19);
                logger.info("测试结果：{}", JSON.toJSONString(students));

            } finally {
                session.close();
                reader.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
