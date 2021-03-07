package com.design.singleton.demo;

/**
 * 懒汉模式（线程不安全）
 * @author Jack House
 * @date 2021年02月23日 09:28:30
 * 1.单例模式有一个特点就是不允许外部直接创建，也就是new Singleton_02()，因此这里在默认
 *   的构造函数上添加了私有属性private。
 * 2.目前此种方式的单例确实满足了懒加载，但是如果有多个访问者同时去获取对象实例你可以想象成
 *   一堆人在抢厕所，就会造成多个同样的实例并存，并没有达到单例的要求。
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    public Singleton_01() {

    }

    public static Singleton_01 getInstance() {
        if (null == instance) {
            instance = new Singleton_01();
        }
        return instance;
    }
}
