package com.yumi.job.util;

import org.quartz.JobExecutionContext;

import com.yumi.job.domain.SysJob;

/**
 * 定时任务处理（允许并发执行）
 * 
 * @author yumi
 *
 */
public class QuartzJobExecution extends AbstractQuartzJob
{
    @Override
    protected void doExecute(JobExecutionContext context, SysJob sysJob) throws Exception
    {
        JobInvokeUtil.invokeMethod(sysJob);
    }
}
