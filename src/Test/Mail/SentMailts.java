package Test.Mail;

public class SentMailts {
	public static void main(String[] args) {
		// 这个类主要是设置邮件

	}

	public void sentMail() {
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.qiye.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("kangcs@pgintl.com");
		// 邮箱密码
		mailInfo.setPassword("*****");
		// 发件人
		mailInfo.setFromAddress("kangcs@pgintl.com");
		// 收件人
		mailInfo.setToAddress("16961055@qq.com");
		// 邮件主题
		mailInfo.setSubject("邮件主题");
		// 邮件内容
		mailInfo.setContent("邮件内容");
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);// 发送文体格式
		// sms.sendHtmlMail(mailInfo);// 发送html格式

	}

}
