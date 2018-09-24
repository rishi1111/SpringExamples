package ax5;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("protoype")
public class ClassB {

	public ClassB() {
		System.out.println("COnstructor of CLass B");
	}

	public void someOtherMethod() {
		
	}
	
}
