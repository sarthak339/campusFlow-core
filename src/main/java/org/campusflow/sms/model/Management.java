package org.campusflow.sms.model;

public class Management {
	
	private String name; 
	private Integer schoolId; 
	private String emailId; 
	private String password; 
	private Integer phone; 
	
    
	public Management(String name, Integer schoolId, String emailId, String password, Integer phone){
		this.name = name ; 
		this.schoolId  = schoolId; 
	    this.emailId = emailId; 
	    this.password = password; 
	    this.phone = phone; 
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


	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getPhoneNo() {
		return phone;
	}


	public void setPhoneNo(Integer phone) {
		this.phone = phone;
	}
	
	
	
	
}

