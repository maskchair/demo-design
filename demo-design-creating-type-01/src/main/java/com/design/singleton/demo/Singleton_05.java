package com.design.singleton.demo;

/**
 * 双重锁校验（线程安全）
 * @author Jack House
 * @date 2021年02月23日 10:07:41
 * 1.双重锁的方法是方法级的优化，减少了部分获取实例的耗时。
 * 2.同时这种方式也满足了懒加载。
 */
public class Singleton_05 {

    private static Singleton_05 instance;

    private Singleton_05() {}

    public static Singleton_05 getInstance() {
        synchronized (Singleton_05.class) {
            if(null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
