package com.student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Entity.Student;
import com.student.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService std_service;
	
	@PostMapping("/student/save")
	public Student saveStudent(@RequestBody Student std) {
		this.std_service.saveStudent(std);
		return std;
	}

	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return std_service.getAllStudent();
	}
	
	@GetMapping("student/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return std_service.getStudenBytId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		std_service.deleteStudent(id);
		return "Deleted Successfully...";
	}
	
	@PutMapping("update/{id}")
	public Student updateStudent(@RequestBody Student std, @PathVariable("id") int id) {
		std_service.updateStudent(std, id);
		return std;
	}
	
}
