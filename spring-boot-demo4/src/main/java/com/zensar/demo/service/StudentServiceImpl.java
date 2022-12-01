package com.zensar.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.demo.entity.Student;
import com.zensar.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student getStudent(int studentId) {
		return studentRepository.getStudent(studentId);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.getAllStudents();
	}

	@Override
	public void insertStudents(Student student) {
		studentRepository.insertStudents(student);
	}

	@Override
	public void updateStudent(int studentId, Student student) {
		studentRepository.updateStudent(studentId, student);
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteStudent(studentId);
	}

}
