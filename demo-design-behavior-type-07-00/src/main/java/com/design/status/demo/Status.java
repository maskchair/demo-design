package com.design.status.demo;

/**
 * @author Jack House
 * @date 2021年03月23日 08:12:17
 */
public enum Status {

    // 1.创建编辑、2.待审核、3.审核通过（任务扫描成活动中）、4.审核拒绝(可以撤审到编辑状态)、5.活动中、6活动关闭、7活动开启(任务扫描成活动中)
    Editing, Check, Pass, Refuse, Doing, Close, Open

}
