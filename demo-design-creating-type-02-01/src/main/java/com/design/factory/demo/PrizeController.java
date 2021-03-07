package com.design.factory.demo;

import com.alibaba.fastjson.JSON;
import com.design.factory.demo.card.IQiYiCardService;
import com.design.factory.demo.coupon.CouponResult;
import com.design.factory.demo.coupon.CouponService;
import com.design.factory.demo.goods.DeliverReq;
import com.design.factory.demo.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jack House
 * @date 2021年02月23日 15:54:10
 */
public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try{
            logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
            //按照不同类型发放商品[1.优惠券、2.实物商品、3.第三方兑换卡(爱奇艺)]
            if(req.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.setCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
                if("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000","发放成功");
                }else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            } else if (req.getAwardType() == 2) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if(isSuccess){
                    awardRes = new AwardRes("0000","发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            } else if (req.getAwardType() == 3) {
                String  bindMobilerNumber = queryUserPhoneNumber(req.getuId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobilerNumber, req.getAwardNumber());
                awardRes = new AwardRes("0000","发放成功");
            }
            logger.info("奖品发放完成{}。", req.getuId());
        }catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}",req.getuId(), reqJson, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }
        return awardRes;
    }

    private  String queryUserName(String uId) { return "张三"; }

    private String queryUserPhoneNumber(String uId) { return "13610604821";}
}
