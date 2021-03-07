package com.design.decorator.demo;

/**
 * @author Jack House
 * @date 2021年03月06日 21:10:51
 */
public interface HandlerInterceptor {

    /**
     * 统一请求接口
     * @param request
     * @param response
     * @param handler
     * @return
     */
    boolean preHandle(String request, String response, Object handler);

}
