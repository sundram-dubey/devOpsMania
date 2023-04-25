package com.hcl.devOps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FrontController {

	@GetMapping("viewPage")
	public ModelAndView getPage() {
		System.out.println("FrontController.getPage()");
		return new ModelAndView("index");
	}
}
