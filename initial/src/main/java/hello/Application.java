package hello;
                        
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@RequestMapping("/")
	public String home() {
		return "<h1>Spring Boot Hello World!</h1>";
	}
        @RequestMapping("/generateLogs")
        public String generateLogs() {
                System.out.println("Generating some test logs for verification");
                for( int i=0;i<10;i++){
                   System.out.println("Test Log statement:"+i);
                }
                return "<h1>Generated some sample log statement </h1>";
        }
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
