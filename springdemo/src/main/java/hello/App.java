package hello;

import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;



import hello.*;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan
public class App 
{
	@Named("APP.BEAN")
    MessageService mockMessageService() {
    return new MessageService() {
        public String getMessage() {
          return "Hello World!";
        }
    };
}

public static void main(String[] args) {
  ApplicationContext context = 
      new AnnotationConfigApplicationContext(App.class);
  MessagePrinter printer = context.getBean(MessagePrinter.class);
  printer.printMessage();
}
}