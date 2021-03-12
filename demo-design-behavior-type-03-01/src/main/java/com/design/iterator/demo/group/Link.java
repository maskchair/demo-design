package com.design.iterator.demo.group;

/**
 * 树节点链路
 * @author Jack House
 * @date 2021年03月12日 13:37:22
 */
public class Link {

    /**
     * 来源雇员ID
     */
    private String fromId;

    /**
     * 到达雇员ID
     */
    private String toId;

    public Link(String fromId, String toId) {
        this.fromId = fromId;
        this.toId = toId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }
}
