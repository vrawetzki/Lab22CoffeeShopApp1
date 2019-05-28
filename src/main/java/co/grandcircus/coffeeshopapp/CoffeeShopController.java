package co.grandcircus.coffeeshopapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {

	
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("coffee-shop");
	}
	
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	@PostMapping("forminfo")
	public ModelAndView formDetails(@RequestParam("firstName") String fName, 
			@RequestParam("lastName") String lName, 
			@RequestParam("email") String emailAddress, 
			@RequestParam("phone") int phoneNumber, 
			@RequestParam("password") String passwordString) {
		
		User newUser = new User();
		return new ModelAndView("adduser", "nU", fName);
		
	}
}
