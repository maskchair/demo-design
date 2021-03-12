package com.design.iterator.demo.lang;

/**
 * @author Jack House
 * @date 2021年03月12日 13:26:34
 */
public interface Iterator<E> {

    /**
     * 是否有下一个节点
     * @return
     */
    boolean hasNext();

    /**
     * 返回下一个节点
     * @return
     */
    E next();

}
