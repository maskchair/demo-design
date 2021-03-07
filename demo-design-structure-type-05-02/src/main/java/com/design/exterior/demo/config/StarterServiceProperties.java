package com.design.exterior.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author qinhuajiao
 * @date 2021年03月07日 09:57:46
 */
@ConfigurationProperties("door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
