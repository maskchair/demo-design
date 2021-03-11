package com.design.command.demo.test;

import com.design.command.demo.Koji;
import com.design.command.demo.cook.impl.GuangDongCook;
import com.design.command.demo.cook.impl.JiangSuCook;
import com.design.command.demo.cook.impl.ShanDongCook;
import com.design.command.demo.cook.impl.SiChuanCook;
import com.design.command.demo.cuisine.ICuisine;
import com.design.command.demo.cuisine.impl.GuangDoneCuisine;
import com.design.command.demo.cuisine.impl.JiangSuCuisine;
import com.design.command.demo.cuisine.impl.ShanDongCuisine;
import com.design.command.demo.cuisine.impl.SiChuanCuisine;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jack House
 * @date 2021年03月11日 21:27:41
 */
public class ApiTest {

    @Test
    public void test(){

        // 菜系 + 厨师；广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        ICuisine guangDoneCuisine = new GuangDoneCuisine(new GuangDongCook());
        JiangSuCuisine jiangSuCuisine = new JiangSuCuisine(new JiangSuCook());
        ShanDongCuisine shanDongCuisine = new ShanDongCuisine(new ShanDongCook());
        SiChuanCuisine siChuanCuisine = new SiChuanCuisine(new SiChuanCook());

        // 点单
        Koji koji = new Koji();
        koji.order(guangDoneCuisine);
        koji.order(jiangSuCuisine);
        koji.order(shanDongCuisine);
        koji.order(siChuanCuisine);

        // 下单
        koji.placeOrder();

    }

    @Test
    public void test_(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("Mary","1243ew");
        map.put("Anna","fds32");
        map.put("Bom","dfre23");
        map.put("Jim","bbnyt");
        map.put("Kary","ppli");
        System.out.println(map.keySet());

        for (String k:map.keySet()){
            System.out.println(k.hashCode());
        }

        Map<String,String> map2 = new HashMap<String, String>();
        map2.put("A","1243ew");
        map2.put("B","fds32");
        map2.put("C","dfre23");
        map2.put("D","bbnyt");
        map2.put("E","ppli");



        System.out.println(map2.keySet());
        for (String k:map2.keySet()){
            System.out.println(k.hashCode());
        }
    }
}
