package com.gesoft.managerproject.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gesoft.managerproject.model.Developer;
import com.gesoft.managerproject.model.Project;

@Controller
@SessionAttributes({"skills", "types", "developer"})
@RequestMapping(value = "/developer")
public class DeveloperController {

	@RequestMapping(value = "/")
	public String addDeveloper() {
		return "AddDeveloper";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String saveDeveloper(@ModelAttribute @Valid  Developer developer) {
		return "success";
	}

	
	
	@ModelAttribute("developer")
	public Developer getDeveloper() {
		return new Developer();
	}

	@ModelAttribute("skills")
	public String[] getSkills() {
		System.out.println("getting skills");
		return new String[] { "Java", "Java EE", "JSF", "PrimeFaces", "SASS", "CSS", "JavaScript", "Nodejs", "Spring",
				"Spring MVC", "Spring Data", "Spring AOP", "ExpressJs", "AngularJs", "MongoDB", "REST API", "Jersey" };
	}
	
	
	@ModelAttribute("types")
	public String[] getTypes() {
		System.out.println("getting types");
		return new String[] { "Frontend", "Backend", "FullStack"};
	}
	
	


}
