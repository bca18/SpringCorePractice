package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Cert certi;
	private List<Integer> list;
	
	public Person(String name, int personId, Cert cert, List<Integer> list) {
		this.name = name;
		this.personId = personId;
		certi = cert;
		this.list = list;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personId + " {" + this.certi.name + "} " + "Friends: " + this.list;
	}
	
	
}
