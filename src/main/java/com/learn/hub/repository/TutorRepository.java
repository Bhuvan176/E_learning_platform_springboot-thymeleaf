package com.learn.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.hub.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
	boolean existsByMobile(long mobile);

	boolean existsByEmail(String email);
	
	Tutor findByEmail(String email);
}
