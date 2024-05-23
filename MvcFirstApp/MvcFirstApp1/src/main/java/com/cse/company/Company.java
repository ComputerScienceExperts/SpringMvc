package com.cse.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/company")
public class Company {
	@GetMapping("/url")
	public ModelAndView mc() {
		ModelAndView mc = new ModelAndView();
		mc.setViewName("second");
		return mc;
	}
}
