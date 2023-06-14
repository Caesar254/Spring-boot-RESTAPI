package com.xadmin.SpringBootCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // an entity class marked with entity annotation
@Table (name="Subject") //Table to becreated in the database, will create the table in the databse
public class Subject {
	
	@Id // it should be a primary key
	private String id;
	private String name;
	
	
	
	
	public Subject() {
		super();
		
		
			
	}
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
