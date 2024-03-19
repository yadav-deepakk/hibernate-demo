package com.hibernate.demo.hibernate_demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;

	private String courseName;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courseList")
	private List<Student> studentList = new ArrayList<Student>();

	public Course() {
		super();
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return studentList;
	}

	public void setStudents(List<Student> studentList) {
		this.studentList = studentList;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}

}
