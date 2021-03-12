package com.design.iterator.demo.lang;

/**
 * @author Jack House
 * @date 2021年03月12日 13:26:17
 */
public interface Iterable<E> {

    /**
     * 迭代
     * @return
     */
    Iterator<E> iterator();

}
