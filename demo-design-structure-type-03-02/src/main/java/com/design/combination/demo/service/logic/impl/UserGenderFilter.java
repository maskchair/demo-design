package com.design.combination.demo.service.logic.impl;

import com.design.combination.demo.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author Jack House
 * @date 2021年03月05日 10:52:41
 */
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }
}
