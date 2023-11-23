package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.models.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.impl.StudentServiceImpl;

public class StudentServiceTest {
	
	StudentServiceImpl studentService;
	 
	@BeforeEach
	void init() {
		StudentRepository mockStudentRepository = mock(StudentRepository.class);
		studentService = new StudentServiceImpl();
		studentService.setRepository(mockStudentRepository);
	}
 
	@Test
	@DisplayName("Test insertion of students")
	void testInsertStudent() {
		Student student = new Student();
		when(studentService.studentRepository.save(student)).thenReturn(student);
		student.setId("dffojddscwfwiooisfwioj");
		String messageForInvalidStudent = studentService.insertStudent(student);
		assertEquals("Student saved successfully",messageForInvalidStudent);
	}

}
