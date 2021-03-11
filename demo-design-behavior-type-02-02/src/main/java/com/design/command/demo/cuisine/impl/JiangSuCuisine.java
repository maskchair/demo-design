package com.design.command.demo.cuisine.impl;

import com.design.command.demo.cook.ICook;
import com.design.command.demo.cuisine.ICuisine;

/**
 * 江苏（苏菜）
 * @author Jack House
 * @date 2021年03月11日 21:22:07
 */
public class JiangSuCuisine implements ICuisine {

    private ICook cook;

    public JiangSuCuisine(ICook cook) {
        this.cook = cook;
    }

    public void cook() {
        cook.doCooking();
    }

}
