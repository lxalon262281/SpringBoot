package com.lx.jpaTest.batch.config;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;


/**
 * 监听器
 */
public class CsvJobListener implements JobExecutionListener {

    long starttime;
    long endTime;

    @Override
    public void beforeJob(JobExecution jobExecution) {
        //任务开始前
        starttime = System.currentTimeMillis();
        System.out.println("任务处理开始");

    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        //任务结束后
        endTime = System.currentTimeMillis();
        System.out.println("任务处理结束");
        System.out.println("耗时" + (endTime - starttime) + " ms");
    }
}
