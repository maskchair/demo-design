package com.design.iterator.demo.lang;

/**
 * @author Jack House
 * @date 2021年03月12日 13:26:02
 */
public interface Collection<E,L> extends Iterable<E> {

    /**
     * 添加
     * @param e
     * @return
     */
    boolean add(E e);

    /**
     * 移除
     * @param e
     * @return
     */
    boolean remove(E e);

    /**
     * 添加链接
     * @param key
     * @param l
     * @return
     */
    boolean addLink(String key, L l);

    /**
     * 移除链接
     * @param key
     * @return
     */
    boolean removeLink(String key);

    /**
     * 迭代
     * @return
     */
    Iterator<E> iterator();

}
