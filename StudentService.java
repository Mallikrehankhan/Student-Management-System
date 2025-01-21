package com.edu.service;

import java.util.List;

import com.edu.dao.Student;

public interface StudentService {

	List<Student> getAllStudents();
    Student createStudent(Student student);
    void deleteStudent(Long id);
	
}
