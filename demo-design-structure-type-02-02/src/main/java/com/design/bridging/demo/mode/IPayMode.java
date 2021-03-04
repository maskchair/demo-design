package com.design.bridging.demo.mode;

/**
 * @author qinhuajiao
 * @date 2021年03月04日 08:42:26
 */
public interface IPayMode {
    /**
     * 支付环境安全校验
     * @param uId
     * @return
     */
    boolean security(String uId);

}
