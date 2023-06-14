package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.SubjectService;

@RestController
public class SubjectController {
	
	//take the objects of SubjectService class i.e reference
	@Autowired
	private SubjectService subjectservice;
	
	
	
	@RequestMapping("/subjects")  // to map the url 
	public List<Subject>getAllSubjects(){
		//call getAllSubjects method here
		
          return subjectservice.getAllSubjects();
	}
	
	// method to create a new subject in database
	@RequestMapping(method = RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectservice.addSubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/subjects/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
	{
		subjectservice.updateSubject(id, subject);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
	public void DeleteSubject(@PathVariable String id)
	{
		subjectservice.deleteSubject(id);
	}

}
