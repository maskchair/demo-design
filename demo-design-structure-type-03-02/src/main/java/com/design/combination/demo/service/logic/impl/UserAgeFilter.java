package com.design.combination.demo.service.logic.impl;

import com.design.combination.demo.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author qinhuajiao
 * @date 2021年03月05日 10:52:23
 */
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
