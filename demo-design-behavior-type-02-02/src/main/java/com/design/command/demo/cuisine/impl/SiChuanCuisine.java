package com.design.command.demo.cuisine.impl;

import com.design.command.demo.cook.ICook;
import com.design.command.demo.cuisine.ICuisine;

/**
 * 四川（川菜）
 * @author Jack House
 * @date 2021年03月11日 21:25:13
 */
public class SiChuanCuisine implements ICuisine {

    private ICook cook;

    public SiChuanCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
