package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi") // this is same as <bean id="hi" class="ex1.HelloWorld">
public class HelloWorld {

	private String name;

	public String getName() {
		return name;
	}
@Value("Annotated Name")
	public void setName(String name) {
		this.name = name;
	}

	public HelloWorld() {
		System.out.println("Default Constructor");
	}

	public HelloWorld(String name) {
		this.name = name;
		System.out.println("Param Constructor");
	}

	
}
