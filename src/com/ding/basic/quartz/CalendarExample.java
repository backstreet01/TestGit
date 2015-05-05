package com.ding.basic.quartz;

import java.util.GregorianCalendar;

import org.quartz.Calendar;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.calendar.AnnualCalendar;

public class CalendarExample {

	public static void main(String[] args) throws SchedulerException {
		SchedulerFactory schedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = schedulerFactory.getScheduler();
		AnnualCalendar holidays = new AnnualCalendar();
		Calendar laborDay = (Calendar) new GregorianCalendar();
		((GregorianCalendar) laborDay).add(Calendar.MONTH,5);
	}
}
