package org.sjcem.placementmanagement.services;

import java.util.List;

import org.sjcem.placementmanagement.entities.College;
import org.sjcem.placementmanagement.entities.Student;
import org.sjcem.placementmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	
	//create and update
	public void create(Student student) {
		repo.save(student);
	}
	
	//retrieve with specific ID
	public Student retrieve(Integer id) {
		return repo.findById(id).get();
	}
	
	//retrieve all records
	public List<Student> retrieveAll() {
		return repo.findAll();
	}
	
	//delete with specific Id
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	
}
