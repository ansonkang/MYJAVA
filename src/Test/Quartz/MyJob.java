package Test.Quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import Test.Mail.SentMailts;

/**
 * 需要执行的任务
 * 
 * @author lhy
 *
 */
public class MyJob implements Job {
	SentMailts sentMailts = new SentMailts();
	int i = 0;

	@Override
	// 把要执行的操作，写在execute方法中
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println(i + "========================测试Quartz" + new Date());

		sentMailts.sentMail();
		i++;
	}
}
