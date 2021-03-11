package com.design.command.demo.cuisine.impl;

import com.design.command.demo.cook.ICook;
import com.design.command.demo.cuisine.ICuisine;

/**
 * 广东（粤菜）
 * @author Jack House
 * @date 2021年03月11日 21:19:52
 */
public class GuangDoneCuisine implements ICuisine {

    private ICook cook;

    public GuangDoneCuisine(ICook cook) { this.cook = cook; }

    public void cook() {
        cook.doCooking();
    }
}
