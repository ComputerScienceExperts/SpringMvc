package com.cse.emp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Employee {
	@GetMapping("/show")
	public ModelAndView mv() {
		ModelAndView m = new ModelAndView();
		m.setViewName("input");
		return m;
	}
}
