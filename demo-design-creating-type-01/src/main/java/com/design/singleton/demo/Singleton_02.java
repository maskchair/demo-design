package com.design.singleton.demo;

/**
 * 懒汉模式（线程安全）
 * @author qinhuajiao
 * @date 2021年02月23日 09:28:30
 * 1.此种模式虽然是安全的，但由于把锁加在方法上后，所有的访问都因需要锁占用导致资源的浪费。
 *   如果不是特殊情况下，不建议此种方式实现单例模式。
 */
public class Singleton_02 {

    private static Singleton_02 instance;

    public Singleton_02() {

    }

    public static synchronized Singleton_02 getInstance() {
        if (null == instance) {
            instance = new Singleton_02();
        }
        return instance;
    }
}
