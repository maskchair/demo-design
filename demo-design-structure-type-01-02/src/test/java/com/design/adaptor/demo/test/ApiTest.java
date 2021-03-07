package com.design.adaptor.demo.test;

import com.alibaba.fastjson.JSON;
import com.design.adaptor.demo.MQAdapter;
import com.design.adaptor.demo.OrderAdapterService;
import com.design.adaptor.demo.RebateInfo;
import com.design.adaptor.demo.impl.InsideOrderService;
import com.design.adaptor.demo.impl.POPOrderAdapterServiceImpl;
import com.design.adaptor.demo.mq.CreateAccount;
import com.design.adaptor.demo.mq.OrderMq;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * @author Jack House
 * @date 2021年03月03日 10:56:51
 */
public class ApiTest {

    @Test
    public void test_MQAdaptor() throws ParseException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = format.parse("2021-03-01 10:56:32");

        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("10020001");
        createAccount.setAddress("浙江省、杭州市、西湖区、西湖中学");
        createAccount.setAccountDate(parse);
        createAccount.setDesc("学校开户");

        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime","accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(createAccount.toString(), link01);

        System.out.println("mq.create_account(适配前)" + createAccount.toString());
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo01));

        System.out.println("");

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("10020002");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(parse);

        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(rebateInfo02));
    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP)：" + popOrderAdapterService.isFirst("10020001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("10020001"));
    }
}
