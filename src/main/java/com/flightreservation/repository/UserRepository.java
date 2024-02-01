package com.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.entity.Persion;

public interface UserRepository extends JpaRepository<Persion, Long > {

	
	Persion findByEmail(String email);
}
