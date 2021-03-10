package com.design.chain.of.responsibility.demo;

/**
 * @author Jack House
 * @date 2021年03月10日 10:59:31
 */
public class AuthInfo {
    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String str : infos) {
            this.info = this.info.concat(str);
        }
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
