package com.design.singleton.demo;

/**
 * 针对枚举单例进一步说明
 * @author Jack House
 * @date 2021年02月23日 11:15:23
 */
public class User {

    /**
     * 私有化构造函数
     */
    private User(){}

    /**
     * 定义一个静态枚举类
     */
    static enum SingletonEnum {
        //创建一个枚举对象，该对象天生为单例
        INSTANCE;
        private User user;
        //私有化枚举构造函数
        private SingletonEnum() {
            user = new User();
        }

        public User getInstence() {
            return user;
        }
    }

    //对外暴露一个获取User对象的静态方法
    public static User getInstance() {
        return SingletonEnum.INSTANCE.getInstence();
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(User.getInstance());
        System.out.println(User.getInstance());
        System.out.println(User.getInstance() == User.getInstance());
    }
}
