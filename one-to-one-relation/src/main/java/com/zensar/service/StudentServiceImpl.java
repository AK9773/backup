package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entity.Student;
import com.zensar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository StudentRepository;

	public List<Student> getAllStudent() {
		return StudentRepository.findAll();
	}
	
	
}
