package com.design.singleton.demo;

/**
 * 饿汉模式（线程安全）
 * @author Jack House
 * @date 2021年02月23日 09:50:43
 * 1.此种方式与我们开头的第一个实例化Map基本一致，在程序启动的时候直接运行加载，后续有外部需要使用的
 *   时候获取即可。
 * 2.但此种方式并不是懒加载，也就是说无论你的程序中是否用到这样的类都会在程序启动之初进行创建。
 * 3.那么这种方式导致的问题就像你下载个游戏软件，可能你游戏地图还没打开，但程序已经将这些地图全部实例化。
 *   到你的手机上最明显的体验就是一开游戏内存满了，手机卡了，需要换手机了。
 */
public class Singleton_03 {
    public static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {}

    public static Singleton_03 getInstance() {
        return instance;
    }
}
