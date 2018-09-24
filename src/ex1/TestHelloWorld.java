package ex1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	@Test
	public void testGreeting() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("ex1/appctx.xml"); // to set the path of xml file
																							// ( can be either
																							// FileSystem, URL or in
																							// ClassPath
		HelloWorld hw = (HelloWorld) appCtx.getBean("hello");// returns the object of HelloWorld class
		System.out.println(hw.getGreeting());
	}

}
