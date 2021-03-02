package com.design.prototype.demo;

/**
 * 解答题
 * @author qinhuajiao
 * @date 2021年03月02日 18:55:31
 */
public class AnswerQuestion {

    /**
     * 问题
     */
    private String name;

    /**
     * 答案
     */
    private String key;

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
