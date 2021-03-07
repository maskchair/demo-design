package com.design.exterior.demo.config;

import org.springframework.util.StringUtils;

/**
 * @author Jack House
 * @date 2021年03月07日 09:57:25
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
