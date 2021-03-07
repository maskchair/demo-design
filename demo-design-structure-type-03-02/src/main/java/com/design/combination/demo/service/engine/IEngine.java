package com.design.combination.demo.service.engine;

import com.design.combination.demo.model.aggregates.TreeRich;
import com.design.combination.demo.model.vo.EngineResult;

import java.util.Map;

/**
 * @author Jack House
 * @date 2021年03月05日 10:48:09
 */
public interface IEngine {

    /**
     * 执行结果
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter
     * @return
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
