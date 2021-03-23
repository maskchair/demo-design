package com.design.status.demo.test;

import com.alibaba.fastjson.JSON;
import com.design.status.demo.ActivityExecStatusController;
import com.design.status.demo.ActivityService;
import com.design.status.demo.Result;
import com.design.status.demo.Status;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jack House
 * @date 2021年03月23日 09:05:37
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        //初始化数据
        String activityId = "100001";
        ActivityService.init(activityId, Status.Editing);

        ActivityExecStatusController activityExecStatusController = new ActivityExecStatusController();
        Result resultRefuse = activityExecStatusController.execStatus(activityId, Status.Editing, Status.Refuse);
        logger.info("测试结果(编辑中To审核拒绝)：{}", JSON.toJSONString(resultRefuse));

        Result resultCheck = activityExecStatusController.execStatus(activityId, Status.Editing, Status.Check);
        logger.info("测试结果(编辑中To提交审核)：{}", JSON.toJSONString(resultCheck));
    }
}
