package com.design.combination.demo.model.vo;

/**
 * @author Jack House
 * @date 2021年03月05日 10:28:01
 */
public class TreeRoot {
    /**
     * 规则树ID
     */
    private Long treeId;

    /**
     * 规则树根ID
     */
    private Long treeRootNodeId;

    /**
     * 规则树名称
     */
    private String treeName;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
