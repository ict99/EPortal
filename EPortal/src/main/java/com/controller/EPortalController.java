package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.EPortal;

//use appropriate annotation to configure BillController as Controller
public class EPortalController {
	
	//invoke the service class - calculateCourseFeesmethod.
	public String calculateCourseFees(@ModelAttribute("ePortal") EPortal ePortal, 
			BindingResult result,ModelMap model) {
		
		return null;
	}

}
