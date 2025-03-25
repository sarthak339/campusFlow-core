package org.campusflow.sms.model;

import java.time.LocalDate;



public class School {

	private Integer Id;
	
	private String name;

	private String principal;

	private String address;

	private String district;

	private String state;
	
	private Integer pin_code;

	private Integer phone;


	private String emailId;
	
	private String password; 
	
	private String managementName ; 

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getManagementName() {
		return managementName;
	}

	public void setManagementName(String managementName) {
		this.managementName = managementName;
	}

	private LocalDate established;

	public Integer getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPin_code() {
		return pin_code;
	}

	public void setPin_code(Integer pin_code) {
		this.pin_code = pin_code;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String email) {
		this.emailId = email;
	}

	public LocalDate getEstablished() {
		return established;
	}

	public void setEstablished(LocalDate established) {
		this.established = established;
	}
}
