package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	public StudentRepository studentRepository;
 
	@Autowired
	MongoTemplate mongoTemplate;
	
	public String getDetails(Student student){
		String details = student.getName();
		return "Details";
	}
	
	public void setRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public String insertStudent(Student student) {
		if (student.getId() != null) {
			if (studentRepository.existsById(student.getId())) {
				return "Student Already Exists";
			}
		}
		try {
			studentRepository.save(student);
			return "Student saved successfully";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
