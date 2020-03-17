package com.example.demo.models;

public class Student {

	private Long sid;
	private String studentname;
	private Course course;

	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", studentname=" + studentname + ", course=" + course + "]";
	}

}
