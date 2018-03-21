package com.fly.task;

import com.fly.proxy.BaseSchedule;



/**
 * Created by jinxiaofei.
 * Time 17/2/17 下午1:01
 * Desc 文件描述
 */
public class Task1 extends BaseSchedule {
    
    @Override
    public boolean isScheduleOpen() {
        
        return true;
    }
    
    @Override
    public void doTask() {
    
        logger.info("this is the task1");
    }
}
