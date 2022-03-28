package com.hans.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

/**
 * @Author: hans
 * @Date: 2022/3/29 0:29
 */
public class TestCreate {

    /**
     * 使用 activiti 的默认方式创建数据库表
     */
    @Test
    public void test(){
        /**
         * 使用 activiti 提供的工具类 ProcessEngine，ProcessEngines getDefaultProcessEngine
         * 方法
         */
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        System.out.println(processEngine);
    }
}
