package com.design.combination.demo.service.logic;

import com.design.combination.demo.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author Jack House
 * @date 2021年03月05日 10:51:47
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     * @param matterValue       决策值
     * @param treeNodeLinkList  决策节点
     * @return
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);

    /**
     * 获取决策值
     * @param treeId
     * @param userId
     * @param decisionMater
     * @return
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMater);
}
