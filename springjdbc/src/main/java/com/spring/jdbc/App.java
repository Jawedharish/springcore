package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started.........." );
		/*
		 * //spring jdbc => jdbcTemplete ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/spring/jdbc/config.xml"); JdbcTemplate
		 * template = context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * // insert query String
		 * query="insert into student(id,name,city) values(?,?,?)"; 
		 * //fire query int result = template.update(query,431,"Akhalque","Mumbai");
		 * System.out.println("Number of record inserted is:...."+result);
		 */
        //spring jdbc => jdbcTemplete 
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        // inserting data
		/*
		 * Student student=new Student(); student.setId(23241);
		 * student.setName("smith"); student.setCity("kanpur");
		 * int result = studentDao.insert(student);
		 * System.out.println("Student added :..........."+result);
		 */
        //updating data
		/*
		 * Student student=new Student(); student.setId(23241); student.setName("Raj");
		 * student.setCity("Delhi"); int result = studentDao.change(student);
		 * System.out.println("data changed:..........."+result);
		 */
        
        // delete data
		/*
		 * int result = studentDao.delete(23523);
		 * System.out.println("Deleted data :........"+result);
		 */
        // selecting one student
		/*
		 * Student student = studentDao.getStudent(431); System.out.println(student);
		 */
        //selecting multiple students
        
        List<Student> students = studentDao.getAllStudent();
        for(Student s:students)
        {
        	System.out.println(s);
        }
        
    }
}
