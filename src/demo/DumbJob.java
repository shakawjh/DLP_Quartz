package demo;

import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
/**
 * дҵ�������
 * �������Ҫ��������quartz�е����ఴ��ָ���Ĺ�����е���ִ�б�Ҫ��ҵ���߼���
 * @author wjh
 *
 */
public class DumbJob implements Job {
/**
 * ҵ�񷽷�
 * 
 */
	Logger logger=Logger.getLogger(DumbJob.class);
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("Hello , this time is " + new Date());
		logger.info("Hello , this time is " + new Date());
	}

}
