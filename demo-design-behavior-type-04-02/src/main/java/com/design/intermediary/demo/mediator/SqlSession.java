package com.design.intermediary.demo.mediator;

import java.util.List;

/**
 * @author Jack House
 * @date 2021年03月16日 16:33:40
 */
public interface SqlSession {

    /**
     * 查询对象（单个）
     * @param statement
     * @param <T>
     * @return
     */
    <T> T selectOne(String statement);

    /**
     * 根据参数查询对象(单个)
     * @param statement sql
     * @param parameter 传参
     * @param <T>
     * @return
     */
    <T> T selectOne(String statement, Object parameter);

    /**
     * 查询对象（多个）
     * @param statement
     * @param <T>
     * @return
     */
    <T> List<T> selectList(String statement);

    /**
     * 根据传参查询对象（多个）
     * @param statement
     * @param parameter
     * @param <T>
     * @return
     */
    <T> List<T> selectList(String statement, Object parameter);

    /**
     * 关闭连接
     */
    void close();
}
