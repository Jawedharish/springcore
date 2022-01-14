package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Starting.........");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setStudentId(102);
		student.setStudentCity("Noida");
		student.setStudentName("H. Javed");

		/*
		 * // inserting the data int r = studentDao.insert(student);
		 * System.out.println("Done inserting......"+r+"  Records.");
		 */
		/*
		 * //updating data studentDao.updateStudent(student);
		 */
		/*
		 * // deleting the data studentDao.deleteStudent(102);
		 */
		/*
		 * // getting the single data Student student2 = studentDao.getStudent(103);
		 * System.out.println(student2);
		 */

		/*
		 * // getting all the students List<Student> list = studentDao.getAllStudents();
		 * for (Student s : list) { System.out.println(s); }
		 */

	}
}
