package ax2;

import org.springframework.stereotype.Component;

@Component("text")
public class TextMessageService implements MessageService {

	@Override
	public void send(String to, String msg) {

		System.out.println("Text Message sent to" + to + "with " + msg);
	}

	public TextMessageService() {
		System.out.println("TextMessageService Started...");
	}

}
