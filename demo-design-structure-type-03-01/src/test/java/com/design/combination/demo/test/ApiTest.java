package com.design.combination.demo.test;

import com.design.combination.demo.EngineController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qinhuajiao
 * @date 2021年03月05日 09:53:21
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_EngineController() {
        EngineController engineController = new EngineController();
        String process = engineController.process("00001", "man", 28);
        logger.info("测试结果：{}", process);
    }
}
