package com.student.Repository;

import org.springframework.data.repository.CrudRepository;

import com.student.Entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	public Student findById(int id);
 
}
