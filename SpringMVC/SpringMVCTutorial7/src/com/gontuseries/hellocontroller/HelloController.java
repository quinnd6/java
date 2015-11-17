//gontuseries Spring MVC Tutorials 07 - writing an annotation based controller class -@Controller, @RequestMapping 
package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld()
	{
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hello world");
		
		return model;
	}
}
