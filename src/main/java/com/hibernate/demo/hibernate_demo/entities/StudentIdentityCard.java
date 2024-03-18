package com.hibernate.demo.hibernate_demo.entities;

import java.time.LocalDate;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class StudentIdentityCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iCardNumber;

	private LocalDate issuedDate;

	private int validDuration; // in years

	 @OneToOne(mappedBy = "iCard")
	private Student student;

	public StudentIdentityCard() {
		super();
	}

	public StudentIdentityCard(LocalDate issuedDate, int validDuration, Student student) {
		super();
		this.issuedDate = issuedDate;
		this.validDuration = validDuration;
		this.student = student;
	}

	public StudentIdentityCard(LocalDate issuedDate, int validDuration) {
		super();
		this.issuedDate = issuedDate;
		this.validDuration = validDuration;
	}

	public int getiCardNumber() {
		return iCardNumber;
	}

	public void setiCardNumber(int iCardNumber) {
		this.iCardNumber = iCardNumber;
	}

	public LocalDate getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}

	public int getValidDuration() {
		return validDuration;
	}

	public void setValidDuration(int validDuration) {
		this.validDuration = validDuration;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentIdentityCard [iCardNumber=" + iCardNumber + ", issuedDate=" + issuedDate + ", validDuration="
				+ validDuration + "]";
	}

}
