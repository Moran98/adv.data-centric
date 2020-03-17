package com.example.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Student;

public class StudentController {
	
	  @RequestMapping(value = "/addStudent.html", method=RequestMethod.GET)
	  public String addStudentGET(Model model) {
		  Student s = new Student();
		  model.addAttribute("student", s);
		  
		  return "addStudent";
	  }
	  
	  @RequestMapping(value = "/addStudent.html", method=RequestMethod.POST)
	  public String addStudentPOST(@ModelAttribute("student")Student s) {
		  System.out.println("P name = " + s.getStudentname());
		  return "redirect:finished.html";
	  }

	  @RequestMapping(value = "/finished.html", method=RequestMethod.GET)
	  public String finishedGET() {
		  return "allDone.jsp";
	  }

}
