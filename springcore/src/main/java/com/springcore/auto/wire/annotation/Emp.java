package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address5")
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address3")
	public void setAddress(Address address) {
		System.out.println("Setter call");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(Address address5) {
		super();
		System.out.println("Cons call");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
