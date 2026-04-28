package com.learn.hub.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.hub.model.Course;
import com.learn.hub.model.Tutor;

public interface CourseRepository extends JpaRepository<Course, Long> {

	List<Course> findByTutor(Tutor attribute);

}