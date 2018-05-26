package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloMsgService implements MessageService {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello,spring!";
	}

}
