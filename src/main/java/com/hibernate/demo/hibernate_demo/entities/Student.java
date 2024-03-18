package com.hibernate.demo.hibernate_demo.entities;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;

	private String studentName;

	private String emailId;

	private int phoneNo;

	private int standard;

	@OneToOne
	private StudentIdentityCard iCard;

	public Student() {
		super();
	}

	public Student(String studentName, String emailId, int phoneNo, int standard) {
		super();
		this.studentName = studentName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.standard = standard;
	}

	public Student(String studentName, String emailId, int phoneNo, int standard, StudentIdentityCard iCard) {
		super();
		this.studentName = studentName;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.standard = standard;
		this.iCard = iCard;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public StudentIdentityCard getiCard() {
		return iCard;
	}

	public void setiCard(StudentIdentityCard iCard) {
		this.iCard = iCard;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", standard=" + standard + ", studentName=" + studentName + "]";
	}

}
