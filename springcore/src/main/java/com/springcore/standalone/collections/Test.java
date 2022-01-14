package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		
		Person person =applicationContext.getBean("person1",Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass());
		System.out.println("--------------------------------------");
		System.out.println(person.getFeestructure());
		System.out.println(person.getFeestructure().getClass());
		
	}

}
