import java.util.*;

public class Course {
	
	String name;
	int number;
	String major;
	ArrayList<Course> prerequisites;
	ArrayList<Course> postrequisites;
	
	public Course(String name, int number, String major, ArrayList<Course> prerequisites) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.prerequisites = prerequisites;
	}
	
	public Course() {
		this("Undefined Course", 0000, "!!!!", null);
	}
	
	public boolean hasPrereqs() {
		return (!(this.getPrerequisites().isEmpty()));
	}
	
	public void addPrereq(Course newPrereq) {
		if (!(prerequisites.contains(newPrereq))) {
			this.prerequisites.add(newPrereq);
		}
	}
	
	public void addPostreq(Course newPostreq) {
		if (!(postrequisites.contains(newPostreq))) {
			this.postrequisites.add(newPostreq);
		}
	}
	
	public boolean isMyPrereq(Course otherCourse) {
		if (prerequisites.isEmpty()) {
			return false;
		}
		else {
			if (prerequisites.contains(otherCourse)) {
				return true;
			}
		}
		return false;
	}
	
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getCourseID() {
		return (major + number);
	}
	public int getYear() {
		return (number/1000);
	}
 	public ArrayList<Course> getPrerequisites() {
		return prerequisites;
	}
	public ArrayList<Course> getPostrequisites() {
		return postrequisites;
	}	

}
