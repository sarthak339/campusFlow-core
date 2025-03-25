package org.campusflow.sms.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="management")
public class ManagementEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
    
	@Column(name="name")
	private String name;
	
	@Column(name="school_id")
	private Integer schoolId; 

	
	@Column(name="email_id")
	private String emailId; 
	
	@Column(name="phone")
	private Integer phone;
	
	@Column(name="password")
	private String password; 

	public Integer getId() {
		return Id;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSchoolId() {
		return schoolId;
	}
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getPhoneNumber() {
		return phone;
	}

	public void setPhoneNumber(Integer phone) {
		this.phone = phone;
	} 
}
