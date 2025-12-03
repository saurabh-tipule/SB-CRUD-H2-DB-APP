package com.cjc.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
@Entity
@XmlRootElement
public class Student {

	private String hello;
	private String hii;


	public void login(){
		//  SuccessFully Implement Login Functionality
	}

	 private int id;

	@Id
	private Integer rollno;

	private String name;

	private String address;

	private Float marks;
	

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getMarks() {
		return marks;
	}

	public void setMarks(Float marks) {
		this.marks = marks;
	}

	public void generatePassword(){
		
		// 15 -20 line code  2-hrs

		// 50 line code
	}

}
