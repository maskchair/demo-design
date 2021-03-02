package com.design.prototype.demo.controller.test;

import com.design.prototype.demo.controller.QuestionBankController;
import org.junit.Test;

/**
 * @author qinhuajiao
 * @date 2021年03月02日 19:38:14
 */
public class ApiTest {

    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("张三", "0001"));
        System.out.println(questionBankController.createPaper("李四", "0002"));
        System.out.println(questionBankController.createPaper("王五", "0003"));
    }
}
