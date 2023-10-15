package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A obj1 = (A) context.getBean("aref");
		System.out.println(obj1.getX());
		System.out.println(obj1.getOb().getY());
		System.out.println(obj1);
	}

}
