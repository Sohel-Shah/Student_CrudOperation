package com.student.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.Entity.Student;
import com.student.Repository.StudentRepository;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	public Student saveStudent(Student s) {
		Student std = studentRepo.save(s);
		return std;
	}
	
	public List<Student> getAllStudent(){
		List<Student> list=new ArrayList<Student>();
		studentRepo.findAll().forEach(std -> list.add(std));
		return list;
	}
	
	public Student getStudenBytId(int id) {
		return studentRepo.findById(id);
	}
	
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
	}
	
	public void updateStudent(Student std, int id) {
		std.setId(id);
		this.studentRepo.save(std);
	}
}
