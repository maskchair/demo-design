package com.design.exterior.demo.web;

import com.design.exterior.demo.annotation.DoDoor;
import com.design.exterior.demo.domain.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jack House
 * @date 2021年03月07日 08:57:07
 */
@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private int port;

    @DoDoor(key = "userId", returnJson = "{\"code\":\"1111\",\"info\":\"非白名单课访问用户拦截！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) {
        return new UserInfo("张三：" + userId, 22, "浙江省金华市婺城区天空小区");
    }
}
