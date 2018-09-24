package ax2;

import org.springframework.stereotype.Component;

@Component("whatsapp")

public class WhatsappMessageService implements MessageService {

	public WhatsappMessageService() {
		System.out.println("Whatsapp Service is ready...");
	}
	
	@Override
	public void send(String to, String msg) {

		System.out.println("Whatsapp sent to "+to+"with "+msg);
		
	}

}
