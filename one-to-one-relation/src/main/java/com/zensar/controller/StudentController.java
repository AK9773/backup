package com.zensar.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.entity.Student;
import com.zensar.service.StudentService;

@RestController
@RequestMapping("/Students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/students")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

}
