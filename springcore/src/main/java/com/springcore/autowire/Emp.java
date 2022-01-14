package com.springcore.autowire;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setting values...........");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		System.out.println("inside constructor...........");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	

}
