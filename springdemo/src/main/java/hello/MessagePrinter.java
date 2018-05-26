package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter  {
	private  final MessageService _mService;
	@Autowired
	public MessagePrinter(MessageService mService) {
		// TODO Auto-generated method stub
		_mService=mService;
	}

	public void printMessage() {
        System.out.println(this._mService.getMessage());		
	}
}
