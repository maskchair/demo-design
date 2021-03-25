package com.design.template.demo.impl;

import com.alibaba.fastjson.JSON;
import com.design.template.demo.HttpClient;
import com.design.template.demo.NetMall;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Jack House
 * @date 2021年03月25日 08:46:49
 */
public class DangDangNetMall extends NetMall {

    public DangDangNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    public Boolean login(String uId, String uPwd) {
        logger.info("模拟当当用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    public Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern pattern = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher matcher = pattern.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        if(matcher.find()) {
            map.put("name", matcher.group());
        }
        map.put("price", "5000.00");
        logger.info("模拟当当商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    public String createBase64(Map<String, String> goodsInfo) {
        BASE64Encoder encoder = new BASE64Encoder();
        logger.info("模拟生成当当商品base64海报");
        return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
    }
}
