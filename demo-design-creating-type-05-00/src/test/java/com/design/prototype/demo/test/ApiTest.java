package com.design.prototype.demo.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author qinhuajiao
 * @date 2021年03月02日 18:58:45
 */
public class ApiTest {

    @Test
    public void test_clone() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("xxx");
        list.add("yyy");

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("zzz");

        System.out.println(JSON.toJSONString(list));
        System.out.println(JSON.toJSONString(list1));

        list.remove("xxx");

        System.out.println(JSON.toJSONString(list));
        System.out.println(JSON.toJSONString(list1));
    }
}
