//gontuseries Spring MVC Tutorials 13 - Data Binding with Date, Collection (Arraylist), Long etc. 
package com.gontuseries.studentadmissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model = new ModelAndView("AdmissionForm");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model1)
	{
		model1.addAttribute("headerMessage", "Gontu College of Engineering, India");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1")Student student1)
	{
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
	}
}
