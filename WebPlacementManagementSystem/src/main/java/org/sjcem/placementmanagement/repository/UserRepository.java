package org.sjcem.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.sjcem.placementmanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}