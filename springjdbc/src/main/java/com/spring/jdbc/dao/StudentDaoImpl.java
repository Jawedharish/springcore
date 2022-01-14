package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		// insert query
        String query="insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) {
		//updating data
		String query="update student set name=?, city=? where id=?";
		int r1 = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r1;
	}

	@Override
	public int delete(int studentId) {
		// delete operation
		String query="delete from student where id=?";
		int r2 = this.jdbcTemplate.update(query,studentId);
		return r2;
	}
	
	@Override
	public Student getStudent(int studentId) {
		// selecting single student data
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);		
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		// selecting multiple students data
		String query="select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		
		return students;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	

}
