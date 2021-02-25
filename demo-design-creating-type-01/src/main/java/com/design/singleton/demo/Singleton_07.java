package com.design.singleton.demo;

/**
 * Effective Java֢作者推荐的枚举单例（线程安全）
 * @author qinhuajiao
 * @date 2021年02月23日 10:37:14
 * 1.Effective Java作者推荐使用枚举的方式解决单例模式，此种方式可能是平时最少用到的。
 * 2.这种方式解决了最主要的；线程安全、自由串行化、单一实例。
 * 3.此种方式在存在继承场景下不可使用。
 */
public enum Singleton_07 {

    INSTANCE;

    public void test(){
        System.out.println("hi~");
    }

}
