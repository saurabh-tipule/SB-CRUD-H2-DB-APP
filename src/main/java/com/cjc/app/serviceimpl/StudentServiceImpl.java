package com.cjc.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.model.Student;
import com.cjc.app.repository.StudentRepository;
import com.cjc.app.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	@Autowired
	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public Student saveStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public Student getStudent(int id) {

		if (repository.existsById(id)) {
			return repository.findById(id).get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	@Override
	public List<Student> deleteStudent(int id) {
		repository.deleteById(id);
		return getAllStudent();
	}

}
