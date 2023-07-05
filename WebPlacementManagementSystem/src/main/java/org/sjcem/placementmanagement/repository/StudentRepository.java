package org.sjcem.placementmanagement.repository;

import org.sjcem.placementmanagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
