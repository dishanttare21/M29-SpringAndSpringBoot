package org.sjcem.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.sjcem.placementmanagement.entities.Placement;

/*JPA repository is an interface which contains all the
 * JPA CRUD operations which is required for Springboot*/
public interface PlacementRepository extends JpaRepository<Placement,Integer>{

}
