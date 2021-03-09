package com.design.proxy.demo;

import com.design.proxy.demo.agent.Select;

/**
 * @author Jack House
 * @date 2021年03月09日 15:58:08
 */
public interface IUserDao {

    /**
     * 查询用户信息
     * @param uId
     * @return
     */
    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);
}
