package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name", "Supriya");
		model.addAttribute("id", 123345);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page");
		return "about";
	}
}


