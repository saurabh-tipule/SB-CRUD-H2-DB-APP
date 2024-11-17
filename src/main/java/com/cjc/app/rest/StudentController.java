package com.cjc.app.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.model.Student;
import com.cjc.app.model.Students;
import com.cjc.app.service.StudentService;

@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@PostMapping(value = "/saveStudent",
			consumes = {"application/json","application/xml"},
			produces = {"application/json","application/xml"}
			)
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student stu = service.saveStudent(student);
		return new ResponseEntity<Student>(stu, HttpStatus.CREATED);
	}

	
	@GetMapping(value = "/getStudent/{id}",
			produces = {"application/json","application/xml"})
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id) {
		Student stu = service.getStudent(id);

		if (stu != null) {
			return new ResponseEntity<Student>(stu, HttpStatus.OK);
		}
		return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
	}

	@GetMapping(value = "/getAllStudents",
			produces = {"application/json","application/xml"})
	public ResponseEntity<Students> getAllStudent() {
		
		List<Student> stuList = service.getAllStudent();
		
		Students students = new Students();
		students.setStuList(stuList);
		return new ResponseEntity<Students>(students,HttpStatus.OK);
	}
	
	
	@DeleteMapping(value = "/deleteStudent/{id}",
			produces = {"application/json","application/xml"}
			)
	public ResponseEntity<Students> deleteStudent(@PathVariable("id") int id) {

		List<Student> stuList = service.deleteStudent(id);
		
		Students students =new Students();
		students.setStuList(stuList);
		
		return new ResponseEntity<Students>(students, HttpStatus.OK);
	}
}
