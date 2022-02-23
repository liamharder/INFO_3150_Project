package com.info3150.groupproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.info3150.groupproject.Course;
import com.info3150.groupproject.CourseManagerImp;

@RestController
public class CourseController {
	
	@Autowired
	CourseManagerImp courseManagerImp;
	
	@RequestMapping("/findbyid/{id}")
	public String findCourseByID(@PathVariable int id) {
		return courseManagerImp.findCourseByNum(id);
	}
	
}
