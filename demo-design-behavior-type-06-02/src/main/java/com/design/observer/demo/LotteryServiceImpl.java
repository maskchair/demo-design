package com.design.observer.demo;

import java.util.Date;

/**
 * @author Jack House
 * @date 2021年03月22日 19:26:08
 */
public class LotteryServiceImpl  extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
