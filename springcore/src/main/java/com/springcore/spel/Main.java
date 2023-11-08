package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
	public static void main(String args[]) throws Exception{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo demo = (Demo) context.getBean("demo");
		System.out.println(demo);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("22+44");
		System.out.println(expression.getValue());
	}
}
