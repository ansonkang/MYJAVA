package Test.Mail;

public class SentMailts {
	public static void main(String[] args) {
		// �������Ҫ�������ʼ�

	}

	public void sentMail() {
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.qiye.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("kangcs@pgintl.com");
		// ��������
		mailInfo.setPassword("*****");
		// ������
		mailInfo.setFromAddress("kangcs@pgintl.com");
		// �ռ���
		mailInfo.setToAddress("16961055@qq.com");
		// �ʼ�����
		mailInfo.setSubject("�ʼ�����");
		// �ʼ�����
		mailInfo.setContent("�ʼ�����");
		// �������Ҫ�������ʼ�
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);// ���������ʽ
		// sms.sendHtmlMail(mailInfo);// ����html��ʽ

	}

}
