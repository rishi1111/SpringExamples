package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
	@Test
	public void testProvider() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex2/appctx.xml");
		
		MessageProvider mp = (MessageProvider) appCtx.getBean("provider");
		mp.process("sms", "9322987765", "Hellow");
		mp.process("email", "lnt@lntinfo.com", "Hellow");
		mp.process("whatsapp", "9322987765", "whatsapp");
	}
}
