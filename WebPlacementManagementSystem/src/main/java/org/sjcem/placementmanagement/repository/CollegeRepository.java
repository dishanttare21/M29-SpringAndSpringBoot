package org.sjcem.placementmanagement.repository;

import org.sjcem.placementmanagement.entities.College;
import org.springframework.data.jpa.repository.JpaRepository;

/* JPA repository is an interface which contains all the 
 * JPA CRUD operations which is required for SpringBoot */
public interface CollegeRepository extends JpaRepository<College, Integer> {
	
}
