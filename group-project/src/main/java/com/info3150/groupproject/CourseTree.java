package com.info3150.groupproject;
import java.util.TreeSet;

public class CourseTree {
	
	TreeSet<Course> courseList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Course> testCourseList = new TreeSet<Course>();
		
		Course INFO1111 = new Course("Intro to Hardware & Software", 1111, "INFO", null);
		Course INFO1112 = new Course("Programming 1", 1112, "INFO", null);
		Course INFO1113 = new Course("Systems Analysis & Design", 1113, "INFO", null);
		Course INFO1211 = new Course("OS Principles & Applications", 1211, "INFO", null);
		INFO1211.addPrereq(INFO1111);
		Course INFO1212 = new Course("Networking 1", 1212, "INFO", null);
		Course INFO1213 = new Course("Web Apps", 1213, "INFO", null);
		Course INFO1214 = new Course("Discrete Math", 1214, "INFO", null);
		Course INFO2311 = new Course("Networking 2", 2311, "INFO", null);
		INFO2311.addPrereq(INFO1212);
		Course INFO2312 = new Course("Database Management", 2312, "INFO", null);
		INFO2312.addPrereq(INFO1112);
		INFO2312.addPrereq(INFO1113);
		
		testCourseList.add(INFO1111);
		testCourseList.add(INFO1112);
		testCourseList.add(INFO1113);
		testCourseList.add(INFO1211);
		testCourseList.add(INFO1212);
		testCourseList.add(INFO1213);
		testCourseList.add(INFO1214);
		testCourseList.add(INFO2311);
		testCourseList.add(INFO2312);
		
		CourseTree testTree = new CourseTree(testCourseList);
	}
	
	public CourseTree(TreeSet<Course> courseList) {
		this.courseList = courseList;
	}
	
	CourseTree() {
		this(null);
	}
	
	public void initializeCourseList() {
		for (Course course1 : courseList) {
			//for each course in the course list
			for (Course course2 : course1.getPrerequisites()) {
				//get that course's prerequisites
				//if course 2 is a prerequisite of course 1,
				//then course 1 is a postrequisite of course 2
				course2.addPostreq(course1);
			}
		}
	}
	
	public void draw() {
		
	}

}
