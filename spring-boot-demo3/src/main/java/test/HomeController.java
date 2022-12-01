package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String sayHello() {
		return "<h2> Welcom to Spring Boot </h2>";
	}
	
	@RequestMapping("/abc")
	public String sayHello1() {
		return "<h2> Hello </h2>";
	}

}