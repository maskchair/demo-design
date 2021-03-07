package com.design.singleton.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 静态类使用
 * @author Jack House
 * @date 2021年02月23日 09:18:02
 * 1.这种方式在我们平常的业务开发中非常常见，这样静态类的方式可以在第一层运行的时候直接
 *   初始化Map类，同时这里我们也不需要到延迟加载时使用。
 * 2.在不需要维持任何状态下，仅仅用于全局访问，这个使用静态类的方式更加方便。
 * 3.但如果需要被继承以及需要维持一些特定状态的情况下，就适合使用单例模式。
 */
public class Singleton_00 {
    public static Map<String, String> map = new ConcurrentHashMap<String, String>();
}
