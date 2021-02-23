package com.design.singleton.demo.test;

import com.design.singleton.demo.Singleton_08;
import org.junit.Test;

/**
 * @author qinhuajiao
 * @date 2021年02月23日 11:03:13
 */
public class SingletonTest {

    @Test
    public void test() {
        System.out.println(Singleton_08.INSTANCE.getInstance());
    }
}
