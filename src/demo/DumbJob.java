package demo;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * 写业务调用类
 * 本类的主要功能是由quartz中调度类按照指定的规则进行调用执行必要的业务逻辑。
 * @author wjh
 *
 */
public class DumbJob implements Job {
/**
 * 业务方法
 * 
 */
	Logger logger=Logger.getLogger(DumbJob.class);
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("Hello , this time is " + new Date());
		logger.info("Hello , this time is " + new Date());
	}

}
