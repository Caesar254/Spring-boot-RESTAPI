package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	// subject repository being an inteface , 
	//we cannot vreate an object thus we create a reference object
	
	
	@Autowired
	public SubjectRepository subjectRepo;

	public List<Subject> getAllSubjects(){
		//call the repository class of spring JPA to get all data from the database
		
		List <Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects :: add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
		
	}                      // save method can both be used to update
	                       //a subject and also add a subject

	public void updateSubject(String id, Subject subject) {
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
		
	}
	
}
