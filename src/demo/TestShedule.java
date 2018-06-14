package demo;

import org.quartz.*;
import java.util.*;
/**
 * д������
 * �����Ŀ�������õ��ù��������������ˡ�0/10 * * * * ?����ʾÿ10���Ӿ�ִ��һ��
 * @author wjh
 *
 */
public class TestShedule {
	static SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
	static Scheduler sched;

	public static void run() throws Exception {
		sched = schedFact.getScheduler();// ��ȡ���ȹ�����
		JobDetail jobDetail = new JobDetail("myJob", sched.DEFAULT_GROUP,
				DumbJob.class);// ��������
		CronTrigger trigger = new CronTrigger("myTrigger", "test",
				"0/10 * * * * ?");// ����������
		sched.scheduleJob(jobDetail, trigger);// ��ӵ����ȹ�������
		sched.start();// �������ȹ�����
	}

	public static void stop() throws Exception {
		sched.shutdown();
	}
}
