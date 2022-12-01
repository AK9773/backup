package com.zensar.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.demo.entity.Student;
@Service
public class StudentServiceImpl implements StudentServices{
	
	private List<Student> students = new ArrayList<Student>();

	public StudentServiceImpl() {
		
		students.add(new Student(101, "Sam", 28));
		students.add(new Student(102, "Harry", 25));
		students.add(new Student(103, "Jack", 21));
	}

	@Override
	public Student getStudent(int studentId) {		
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}

		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return students;
	}

	@Override
	public void insertStudents(Student student) {
		students.add(student);
		
	}

	@Override
	public void updateStudent(int studentId, Student student) {
		Student student2 = getStudent(studentId);
		student2.setStudentId(student.getStudentId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentAge(student.getStudentAge());
		//students.add(student2);
	}

	@Override
	public void delete(int studentId) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentId() == studentId) {
				students.remove(student);
			}
		}
		
	}

}
