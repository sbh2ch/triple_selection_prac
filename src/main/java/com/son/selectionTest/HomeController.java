package com.son.selectionTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/select.kosc", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		return "home";
	}
	
}