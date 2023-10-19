package com.springcore.stereotype;
import java.util.Collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student s1 = (Student) context.getBean("ob", Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress().getClass().getName());
		System.out.println(s1.hashCode());
		Student s2 = (Student) context.getBean("ob", Student.class);
		System.out.println(s2.hashCode());
	}

}
