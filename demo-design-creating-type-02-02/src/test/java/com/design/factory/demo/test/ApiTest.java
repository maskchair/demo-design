package com.design.factory.demo.test;

import com.design.factory.demo.StoreFactory;
import com.design.factory.demo.service.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qinhuajiao
 * @date 2021年02月24日 13:17:33
 * 1.从上面的工程结构中可以看出，结构清晰，分层易扩展
 * 2.所有的奖品无论是实物、虚拟还是第三方，都需要通过我们的程序实现此接口进行处理，以保证最
 *   终入参出参的统一性。
 * 3.接口的入参包括; 用户ID、奖品ID、业务ID以及扩展字段用于处理发放实物商品时的收获地址。
 * 4.从上面可以看到每一种奖品的实现包括在自己的类中，新增、修改或者删除都不会影响其他奖品功能的测试，降低回归测试的可能。
 * 5.后续在新增的奖品只需要按照此结构进行填充即可，非常易于维护和扩展。
 * 6.在统一了入参以及出参后，调用方不在需要关心奖品发放的内部逻辑，按照统一的方式即可处理。
 * 7.这里我们定义了一个商店的工厂类，在里面按照类型实现各种商品的服务。可以非常干净整洁的处理你的代码，
 *   后续新增的商品在这里扩展即可。如果不喜欢if判断，也可以使用switch或者map配置结构，会让代码更加干净。
 * 8.另外很多代码检查软件和编码要求，不喜欢if语句后面不易扩展，这里是为了更加干净的向你体现逻辑。实际业务编码中可以加括号。
 * 9.从测试结果可以看出，在进行封装后可以非常清晰的看到一整套发放奖品服务的完整性，统一了入参，统一了结果。
 * 总结：
 * 优点：避免创建者与具体的产品逻辑耦合、满足单一职责、每一个业务逻辑实现都在所属自己的类中完成、满足开闭原则
 * 无需更改使用调用方就可以在程序中引入新的产品类型。
 * 缺点：奖品类型非常多的时候，实现子类太多。
 */
public class ApiTest {

    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        //1.优惠券
        ICommodity iCommodity_01 = storeFactory.getCommodityService(1);
        iCommodity_01.sendCommodity("10001","EGM1023938910232121323432", "791098764902132", null);

        //2.实物商品
        ICommodity iCommodity_02 = storeFactory.getCommodityService(2);
        Map<String, String> map = new HashMap<String, String>();
        map.put("consigneeUserName", "李四");
        map.put("consigneeUserPhone", "15742138569");
        map.put("consigneeUserAddress", "浙江省.金华市.金东区.双龙洞");

        iCommodity_02.sendCommodity("10001","7841896412787", "4815241512354621310", map);

        //3.兑换卡
        ICommodity iCommodity_03 = storeFactory.getCommodityService(3);
        iCommodity_03.sendCommodity("10001", "JHImfdsPfsa5das2A12E2d", null, null);
    }
}
