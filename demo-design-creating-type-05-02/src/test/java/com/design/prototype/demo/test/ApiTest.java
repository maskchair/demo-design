package com.design.prototype.demo.test;

import com.design.prototype.demo.QuestionBankController;
import org.junit.Test;

/**
 * @author Jack House
 * @date 2021年03月02日 20:31:07
 */
public class ApiTest {

    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("张三", "0001"));
        System.out.println(questionBankController.createPaper("李四", "0002"));
        System.out.println(questionBankController.createPaper("王五", "0003"));
    }
}
