package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This is spring mvc controller
@Controller
public class HelloWorldController {

	//This instructs Spring to invoke sayHello method for every http requests with 'hello' hitting our application
	@RequestMapping("/hello")
	public String sayHello() {
		return "index"; // return view name "index"; thymeleafe created a folder called templates under 
						// src/main/resources/static/templates.  Create your views (index.html) there.
	}
}
