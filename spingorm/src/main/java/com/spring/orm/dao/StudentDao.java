package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	//saving student
	@Transactional
	public int insert(Student student) {
		// inserting
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}
	
	// getting the single student
	public Student getStudent(int studentId)
	{
		Student std = this.hibernateTemplate.get(Student.class,studentId);
		return std;
	}
	
	// getting all students(all rows)
	public List<Student> getAllStudents()
	{
		List<Student> std1 = this.hibernateTemplate.loadAll(Student.class);
		return std1;
	}
	
	// deleting the data
	@Transactional
	public void deleteStudent(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	// updating the data
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
