package com.airportmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportmanagement.model.User;

public interface UserRepository extends JpaRepository<User ,Long> {
	 User findByUsername(String username);
	

}
