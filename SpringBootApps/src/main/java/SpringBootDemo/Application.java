package SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/get")
    public String getMessage(){

        return "Lord Thank You For Blessing My Skills.Your Humble Servant Joseph Haddison";
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
