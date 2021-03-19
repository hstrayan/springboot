package springboot.first_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App


{     
	
	@Value("${message}")
private String message;
	
	 @RequestMapping("/")
	    String home() {
	        return message;
	    }
public static void main( String[] args )
{
SpringApplication.run(App.class, args);
}
}
