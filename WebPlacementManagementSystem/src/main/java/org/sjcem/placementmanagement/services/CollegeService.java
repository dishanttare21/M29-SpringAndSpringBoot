package org.sjcem.placementmanagement.services;

import java.util.List;

import org.sjcem.placementmanagement.entities.College;
import org.sjcem.placementmanagement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {
	
	/* To inject the dependency automatically */
	@Autowired
	private CollegeRepository repo;
	
	//create and update
	public void create(College college) {
		repo.save(college);
	}
	
	//retrieve with specific ID
	public College retrieve(Integer id) {
		return repo.findById(id).get();
	}
	
	//retrieve all records
	public List<College> retrieveAll() {
		return repo.findAll();
	}
	
	//delete with specific Id
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
