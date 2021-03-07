package com.design.exterior.demo.domain;

/**
 * @author qinhuajiao
 * @date 2021年03月07日 08:51:38
 */
public class BaseInfo {
    /**
     * 编码
     */
    private String code;

    /**
     * 说明
     */
    private String info;

    public BaseInfo() {
    }

    public BaseInfo(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
