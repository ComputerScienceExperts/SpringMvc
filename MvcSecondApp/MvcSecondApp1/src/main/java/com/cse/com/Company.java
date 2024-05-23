package com.cse.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Company {
	@GetMapping("/show")
	public ModelAndView mv() {
		ModelAndView av = new ModelAndView();
		av.setViewName("home");
		return av;
	}
}
