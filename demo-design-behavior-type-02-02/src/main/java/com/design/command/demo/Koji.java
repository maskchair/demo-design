package com.design.command.demo;

import com.design.command.demo.cuisine.ICuisine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 饭店小二，负责点单
 * @author Jack House
 * @date 2021年03月11日 21:03:24
 */
public class Koji {

    private Logger logger = LoggerFactory.getLogger(Koji.class);

    private List<ICuisine> cuisineList = new ArrayList<ICuisine>();

    public void order(ICuisine cuisine) {
        cuisineList.add(cuisine);
    }

    public synchronized void placeOrder() {
        for (ICuisine cuisine : cuisineList) {
            cuisine.cook();
        }
        cuisineList.clear();
    }

}
