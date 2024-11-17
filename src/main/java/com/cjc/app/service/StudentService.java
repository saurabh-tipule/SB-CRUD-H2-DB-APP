package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Student;

public interface StudentService {

	Student saveStudent(Student student);

	Student getStudent(int id);

	List<Student> getAllStudent();

	List<Student> deleteStudent(int id);

}
