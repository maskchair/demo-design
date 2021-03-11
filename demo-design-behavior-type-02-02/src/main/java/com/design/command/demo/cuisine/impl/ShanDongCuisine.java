package com.design.command.demo.cuisine.impl;

import com.design.command.demo.cook.ICook;
import com.design.command.demo.cuisine.ICuisine;

/**
 * 山东（鲁菜）
 * @author Jack House
 * @date 2021年03月11日 21:23:23
 */
public class ShanDongCuisine implements ICuisine {

    private ICook cook;

    public ShanDongCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
