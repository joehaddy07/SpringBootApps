package SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
