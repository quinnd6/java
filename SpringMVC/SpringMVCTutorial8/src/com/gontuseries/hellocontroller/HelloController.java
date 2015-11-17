//gontuseries Spring MVC Tutorials 08 - MultiAction Controller class, @RequestMapping annotation at class level 
package com.gontuseries.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/greet")
public class HelloController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld()
	{
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hello world");
		
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld()
	{
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg", "hi world");
		
		return model;
	}
}
