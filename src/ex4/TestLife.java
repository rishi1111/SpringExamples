package ex4;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLife {

	
	@Test
	public void lafda() {
		//only configurable application context can be closed
		ConfigurableApplicationContext kuchBhi = new ClassPathXmlApplicationContext("ex4/appctx.xml");
		MyLife dukh = kuchBhi.getBean(MyLife.class);
		
		//if you comment this close method destory-method will not be called
		kuchBhi.close();
	}
	
	
}
