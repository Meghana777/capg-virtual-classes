package com.capg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String getData() {
		
		return "Hello World";
	}

}
