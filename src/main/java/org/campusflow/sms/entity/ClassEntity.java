package org.campusflow.sms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="class")
public class ClassEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id; 
	
	@Column(name="name")
	private String name ; 
	
	@Column(name="roman_name")
	private String romanName; 
	
	@Column(name="class_teacher_id")
	private Integer classTeacherId; 
	
	public Integer getClassTeacherId() {
		return classTeacherId;
	}


	public void setClassTeacherId(Integer classTeacherId) {
		this.classTeacherId = classTeacherId;
	}


	@Column(name="school_id")
	private Integer schoolId;


	public Integer getId() {
		return Id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRomanName() {
		return romanName;
	}


	public void setRomanName(String romanName) {
		this.romanName = romanName;
	}


	public Integer getSchoolId() {
		return schoolId;
	}


	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	} 
	
}
