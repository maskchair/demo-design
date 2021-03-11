package com.design.command.demo.test;

import com.design.command.demo.Koji;
import org.junit.Test;

/**
 * @author Jack House
 * @date 2021年03月11日 20:58:49
 */
public class ApiTest {

    @Test
    public void test() {
        // 广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        Koji koji = new Koji();
        koji.order(1);
        koji.order(2);
        koji.order(3);
        koji.order(4);

        // 下单
        koji.placeOrder();
    }

}
