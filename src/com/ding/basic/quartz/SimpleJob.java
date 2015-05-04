package com.ding.basic.quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job{

	@Override
	public void execute(JobExecutionContext jec) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println(jec.getTrigger().getName() + "triggered time is : " + (new Date()));
	}

}
