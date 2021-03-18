package com.design.intermediary.demo.mediator;

/**
 * @author Jack House
 * @date 2021年03月16日 16:56:32
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection,configuration.mapperElement);
    }
}
