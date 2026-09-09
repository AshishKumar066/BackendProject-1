package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("UserController.greet()");
		return "welcome";
		
	}
	
//	/WEB-INF/JSP/welcome.jsp
	
	
	@RequestMapping("/movies")
	public String movie() {
		System.out.println("UserController.movie()");
		return "movies";
		
	}
	
	
}
