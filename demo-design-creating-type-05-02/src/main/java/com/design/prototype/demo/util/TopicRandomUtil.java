package com.design.prototype.demo.util;

import java.util.*;

/**
 * @author Jack House
 * @date 2021年03月02日 19:59:31
 */
public class TopicRandomUtil {

    public static Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<String>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<String, String>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if(key.equals(next)) {
                keyNew = randomKey;
            }

            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }
}
