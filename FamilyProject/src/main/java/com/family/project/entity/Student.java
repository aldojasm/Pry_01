package com.family.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Students")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Variable Column
	@Id
	@Column(name="student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private byte student_id;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="middle_name")
	private String middle_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="date_of_birth")
	private Date date_of_birth;

	
	//Method Getter and Setter
	public byte getStudent_id() {
		return student_id;
	}

	public void setStudent_id(byte student_id) {
		this.student_id = student_id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}
