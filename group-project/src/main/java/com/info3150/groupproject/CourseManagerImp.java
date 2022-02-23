package com.info3150.groupproject;

import java.util.TreeSet;
import org.springframework.stereotype.Service;

@Service
public class CourseManagerImp implements CourseManager {
	
	TreeSet<Course> courseList;

	@Override
	public String findCourseByNum(int courseNum) {
		for (Course c : courseList) {
			if (c.getNumber() == courseNum) {
				return c.getName();
			}
		}
		return null;
	}

}
