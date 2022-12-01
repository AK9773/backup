package com.zensar.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.demo.entity.Student;

public interface StudentServices {
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
	public void insertStudents(Student student);
	public void updateStudent(int studentId, Student student);
	public void delete(int studentId);
}
