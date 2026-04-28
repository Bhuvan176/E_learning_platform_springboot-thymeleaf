package com.learn.hub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.hub.model.Course;
import com.learn.hub.model.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

	List<Section> findByCourse(Course course);
	
	List<Section> findByCourseIn(List<Course> courses);

}