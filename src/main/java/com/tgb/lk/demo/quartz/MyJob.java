package com.tgb.lk.demo.quartz;

import java.util.ArrayList;
import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

public class MyJob {
	
	 public void work() {  
	        System.out.println("date:" + new Date().toString());  
	    }  
	 
	 public static void main(String[] args) {
		 try {
			Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
			scheduler.start();
			scheduler.shutdown();
//			 StdSchedulerFactory ssf=new StdSchedulerFactory();
//			 Scheduler scheduler = ssf.getScheduler();
//			 JobDetail jobDetail=new JobDetail("myjob",null,DumbJob.class);
//			 jobDetail.getJobDataMap().put("jobSays", "Hello World!");
//			 jobDetail.getJobDataMap().put("myFloatValue", 3.141f);
//			 jobDetail.getJobDataMap().put("myStateData", new ArrayList());
//			 Trigger trigger = TriggerUtils.makeHourlyTrigger(); //每个小时激活一次
//			 trigger.setStartTime(TriggerUtils.getEvenHourDate(new Date()));//在下一个小时启动。
//			 trigger.setName("myTrigger");
//			 sched.scheduleJob(jobDetail, trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
