package com.design.combination.demo.service.engine.impl;

import com.design.combination.demo.model.aggregates.TreeRich;
import com.design.combination.demo.model.vo.EngineResult;
import com.design.combination.demo.model.vo.TreeNode;
import com.design.combination.demo.service.engine.EngineBase;

import java.util.Map;

/**
 * @author qinhuajiao
 * @date 2021年03月05日 10:50:48
 */
public class TreeEngineHandle extends EngineBase {


    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
