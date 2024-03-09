package com.sunbeaminfo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeaminfo.entity.Course;

public interface courseDao extends JpaRepository<Course, Long>{
	
           
}
