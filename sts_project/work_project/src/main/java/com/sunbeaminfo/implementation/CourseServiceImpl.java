package com.sunbeaminfo.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeaminfo.dao.courseDao;
import com.sunbeaminfo.entity.Course;
import com.sunbeaminfo.services.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private courseDao coursedao;
	
	// List<Course>list;
	
	public CourseServiceImpl() {
        
//		list=new ArrayList<>();
//		
//		list.add(new Course(145, "JAva Core Course", "this is java core background course"));
//		list.add(new Course(1425,"Advance JAva Course","This is Advance Java Course"));
		
		
	}
	
	

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}



	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Course c=null;
//		
//		for (Course course : list) {
//			
//			if(course.getId()==courseId)
//			{
//				c=course;
//				break;
//			}

	//	}
		
		
		return coursedao.getOne(courseId);
	}



	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
	//	list.add(course);
		
		coursedao.save(course);
		
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}			
//		});
		
		coursedao.save(course);
		
		return course;
	}



	
	

}
