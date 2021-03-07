package com.design.exterior.demo.domain;

/**
 * @author Jack House
 * @date 2021年03月07日 08:49:21
 */
public class UserInfo extends BaseInfo {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;

    public UserInfo() {
    }

    public UserInfo(String code, String info) {
        super(code, info);
    }

    public UserInfo(String name, Integer age, String address) {
        super("0000", "success");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
