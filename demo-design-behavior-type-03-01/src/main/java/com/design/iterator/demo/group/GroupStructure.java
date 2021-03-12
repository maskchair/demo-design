package com.design.iterator.demo.group;

import com.design.iterator.demo.lang.Collection;
import com.design.iterator.demo.lang.Iterator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Jack House
 * @date 2021年03月12日 13:40:28
 */
public class GroupStructure implements Collection<Employee, Link> {

    /**
     * 树节点
     */
    private String groupId;

    /**
     * 树节点名称
     */
    private String groupName;

    private Map<String, Employee> employeeMap = new ConcurrentHashMap<String, Employee>();

    private Map<String, List<Link>> linkMap = new ConcurrentHashMap<String, List<Link>>();

    private Map<String, String> invertedMap = new ConcurrentHashMap<String, String>();

    public GroupStructure(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }


    public boolean add(Employee employee) {
        return null != employeeMap.put(employee.getuId(), employee);
    }

    public boolean remove(Employee employee) {
        return null != employeeMap.remove(employee.getuId());
    }

    public boolean addLink(String key, Link link) {
        invertedMap.put(link.getToId(), link.getFromId());
        if (linkMap.containsKey(key)) {
            return linkMap.get(key).add(link);
        }
        List<Link> links = new LinkedList<Link>();
        links.add(link);
        linkMap.put(key, links);
        return true;
    }

    public boolean removeLink(String key) {
        return null != linkMap.remove(key);
    }

    public Iterator<Employee> iterator() {
        return new Iterator<Employee>() {

            HashMap<String, Integer> keyMap = new HashMap<String, Integer>(16);

            int totalIdx = 0;

            //雇员ID，From
            private String fromId = groupId;

            //雇员ID，To
            private String toId = groupId;

            public boolean hasNext() {
                return totalIdx < employeeMap.size();
            }

            public Employee next() {
                List<Link> links = linkMap.get(toId);
                int cursorIdx = getCursorIdx(toId);

                // 同级节点扫描
                if (null == links) {
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }

                // 上级节点扫描
                while (cursorIdx > links.size() - 1) {
                    fromId = invertedMap.get(fromId);
                    cursorIdx = getCursorIdx(fromId);
                    links = linkMap.get(fromId);
                }

                // 获取节点
                Link link = links.get(cursorIdx);
                toId = link.getToId();
                fromId = link.getFromId();
                totalIdx++;

                // 返回结果
                return employeeMap.get(link.getToId());
            }

            public int getCursorIdx(String key) {
                int idx = 0;
                if (keyMap.containsKey(key)) {
                    idx = keyMap.get(key);
                    keyMap.put(key, ++idx);
                } else {
                    keyMap.put(key, idx);
                }
                return idx;
            }
        };
    }

}
