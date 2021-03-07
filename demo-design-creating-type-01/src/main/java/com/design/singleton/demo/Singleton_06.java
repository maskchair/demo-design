package com.design.singleton.demo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CAS[AtomicReference](线程安全)
 * @author Jack House
 * @date 2021年02月23日 10:16:00
 * 1.java并发库提供了很多原子类来支持并发访问的数据安全性：AtomicInteger、AtomicBoolean、AtomicLong、AtomicReference。
 * 2.AtomicReference可以封装引用一个V实例，支持并发访问如上的单例方式就是使用了这样的一个特点。
 * 3.使用CAS的好处就是不需要使用传统的加锁方式保证线程安全，而是依赖于CAS的忙等算法，依赖于底层硬件的实现，
 *   来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外的开销，并且可以支持较大的并发性。
 * 4.当然CAS也有一个缺点就是忙等，如果一直没有获取到将会处于死循环中。
 *
 */
public class Singleton_06 {

    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();

    private static Singleton_06 instance;

    private Singleton_06() {}

    public static final Singleton_06 getInstance() {
        for(;;) {
            Singleton_06 instance = INSTANCE.get();
            if(null == instance) {
                INSTANCE.compareAndSet(null, new Singleton_06());
                instance = INSTANCE.get();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance());
        //com.design.singleton.demo.Singleton_07@2503dbd3
        System.out.println(Singleton_06.getInstance());
        //com.design.singleton.demo.Singleton_07@2503dbd3
    }
}
