package com.springcore.ci;

public class Person {
	private int personId;
	private String name;
	private Certificate certificate;
	
	public Person(int personId, String name,Certificate certificate) {
		super();
		this.personId = personId;
		this.name = name;
		this.certificate=certificate;
		
	}

	@Override
	public String toString() {
		/* return "PersonId = " + personId + " : Name = " + name + ""; */
		return this.personId+" : "+this.name+"  { "+this.certificate.name+" }";
	}
	

}
