package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	
	/*public void init() {
		System.out.println("Inside init");
	}
	
	public void destroy() {
		System.out.println("Finishing Bean task...");
	}*/

	@Override //does init work:
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init method by InitializingBean");
	}

	@Override //does destroy work
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Finishing Bean tasks..");
	}
}
