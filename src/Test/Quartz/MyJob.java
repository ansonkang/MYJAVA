package Test.Quartz;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import Test.Mail.SentMailts;

/**
 * ��Ҫִ�е�����
 * 
 * @author lhy
 *
 */
public class MyJob implements Job {
	SentMailts sentMailts = new SentMailts();
	int i = 0;

	@Override
	// ��Ҫִ�еĲ�����д��execute������
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println(i + "========================����Quartz" + new Date());

		sentMailts.sentMail();
		i++;
	}
}
