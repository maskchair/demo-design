package com.design.exterior.demo.web;

import com.design.exterior.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qinhuajiao
 * @date 2021年03月07日 09:15:12
 */
public class HelloWorldController {

    public UserInfo queryUserInfo(@RequestParam String userId) {
        // 做白名单拦截
        List<String> userList = new ArrayList<String>();
        //0001,bbb,dddd
        userList.add("0001");
        userList.add("bbb");
        userList.add("dddd");
        if (!userList.contains(userId)) {
            return new UserInfo("10000", "非白名单可访问用户拦截！");
        }

        return new UserInfo("张三：" + userId, 22, "浙江省金华市婺城区天空小区");
    }

}
