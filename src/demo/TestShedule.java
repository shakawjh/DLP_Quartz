package demo;

import org.quartz.*;
import java.util.*;
/**
 * 写调度类
 * 本类的目的是设置调用规则，在这里我用了“0/10 * * * * ?”表示每10秒钟就执行一次
 * @author wjh
 *
 */
public class TestShedule {
	static SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
	static Scheduler sched;

	public static void run() throws Exception {
		sched = schedFact.getScheduler();// 获取调度管理器
		JobDetail jobDetail = new JobDetail("myJob", sched.DEFAULT_GROUP,
				DumbJob.class);// 创建工作
		CronTrigger trigger = new CronTrigger("myTrigger", "test",
				"0/10 * * * * ?");// 创建触发器
		sched.scheduleJob(jobDetail, trigger);// 添加到调度管理器中
		sched.start();// 启动调度管理器
	}

	public static void stop() throws Exception {
		sched.shutdown();
	}
}
