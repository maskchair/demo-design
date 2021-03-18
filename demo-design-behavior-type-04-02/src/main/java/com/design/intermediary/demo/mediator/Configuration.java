package com.design.intermediary.demo.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * @author Jack House
 * @date 2021年03月16日 16:40:57
 */
public class Configuration {

    protected Connection connection;

    protected Map<String, String> dataSource;

    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }

}
