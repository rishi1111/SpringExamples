package ax1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	@Test
	public void testGreeting() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("annotated.xml"); // to set the path of xml file
																							// ( can be either
																							// FileSystem, URL or in
																							// ClassPath
		HelloWorld hw = (HelloWorld) appCtx.getBean("hi");// returns the object of HelloWorld class using id "hi"
		System.out.println(hw.getName());
		
		HelloWorld hw2 = appCtx.getBean(HelloWorld.class); // using Class type
		System.out.println(hw2.getName());

}
}
