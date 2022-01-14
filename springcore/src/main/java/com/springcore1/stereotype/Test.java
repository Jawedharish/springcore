package com.springcore1.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore1/stereotype/stereoconfig.xml");

		/*
		 * Student student = context.getBean("std", Student.class);
		 * 
		 * System.out.println(student);
		 * System.out.println("____________________________________________");
		 * System.out.println(student.getAddress());
		 * System.out.println(student.getAddress().getClass().getName());
		 * 
		 * 
		 * System.out.println(student.hashCode());
		 * 
		 * Student student1 = context.getBean("std",Student.class);
		 * System.out.println(student1.hashCode());
		 */
		  
		  Teacher teacher1=context.getBean("teach",Teacher.class); Teacher
		  teacher2=context.getBean("teach",Teacher.class);
		 

		System.out.println(teacher1.hashCode());
		System.out.println(teacher2.hashCode());

	}

}
