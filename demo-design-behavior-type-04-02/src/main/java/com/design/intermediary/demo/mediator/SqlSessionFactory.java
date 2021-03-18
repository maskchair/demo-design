package com.design.intermediary.demo.mediator;

/**
 * @author Jack House
 * @date 2021年03月16日 16:38:01
 */
public interface SqlSessionFactory {

    /**
     * 打开查询连接
     * @return
     */
    SqlSession openSession();

}
