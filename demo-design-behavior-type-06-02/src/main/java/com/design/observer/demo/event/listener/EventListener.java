package com.design.observer.demo.event.listener;

import com.design.observer.demo.LotteryResult;

/**
 * @author Jack House
 * @date 2021年03月22日 19:35:38
 */
public interface EventListener {

    void doEvent(LotteryResult result);

}
