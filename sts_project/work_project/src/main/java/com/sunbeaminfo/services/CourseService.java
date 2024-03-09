/**
 * 
 */
package com.sunbeaminfo.services;

import java.util.List;

import com.sunbeaminfo.entity.Course;

/**
 * @author sunbeam
 *
 */
public interface CourseService {

	public List<Course>getCourses();
	
	public Course getCourse(long  courseId);
	
	public Course addCourse( Course course);
	
	public Course updateCourse(Course course);
	
}
