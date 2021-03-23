package com.design.status.demo;

/**
 * @author Jack House
 * @date 2021年03月23日 08:42:39
 */
public class Result {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;

    public Result(String code, String info) {
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
