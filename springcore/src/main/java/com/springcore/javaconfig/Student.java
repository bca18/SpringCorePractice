package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

import com.springcore.lifecycle.Samosa;

public class Student {
	
	private com.springcore.javaconfig.Samosa samosa;
	
	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book");
	}
	public Student(com.springcore.javaconfig.Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	public com.springcore.javaconfig.Samosa getSamosa() {
		return samosa;
	}
	public void setSamosa(com.springcore.javaconfig.Samosa samosa) {
		this.samosa = samosa;
	}
	
	
}
