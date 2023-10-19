package com.springcore.standalone.collections;
import java.util.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/collectionConfig.xml");
		Person p1 = (Person) context.getBean("p1");
		System.out.println(p1);
		System.out.println(p1.getSet().getClass().getName());
	}

}
