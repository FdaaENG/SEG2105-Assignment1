package edu.seg2105.assignment1.exercise2.entities;

public class TA extends Instructor{
	private final int max_courses = 3;
	
	
	public TA(String firstName, String lastName, String id, double salary) {
		super(firstName, lastName, id, salary);
		
	}
	
	
	public boolean assignCourse(Course course) {
		if (courses.size() < max_courses) {
			courses.add(course);
			return true;
		} else {
			return false;
		}
	

 }
	
	 public String toString() {
	    	
		    
	        return "TA information:\n"
	                + "\tFirst name: " + getFirstName() + "\n"
	                + "\tLast name: " + getLastName() + "\n"
	                + "\tEmployee ID: " + getId() + "\n"
	                + "\tSalary: " + getSalary() + "\n"
	                + (courses.size() > 0 ? "\tList of assigned courses:" + getCoursesTable() : "");
	                
	         
	    }
}
