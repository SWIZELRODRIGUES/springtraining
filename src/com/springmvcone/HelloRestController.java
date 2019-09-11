package com.springmvcone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping(path = "/hello.do", method = RequestMethod.GET)
	public String[] sayHello() {
		String[] topics = {"Java","Jsp","Spring"};
		return topics;
	}
}
