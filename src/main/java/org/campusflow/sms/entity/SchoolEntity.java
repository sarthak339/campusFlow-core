package org.campusflow.sms.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "school")

public class SchoolEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Column(nullable = false, unique = true)
	private String name;

	@Column(name = "principal")
	private String principal;

	@Column(name = "address")
	private String address;

	@Column(name = "district")
	private String district;

	@Column(name = "state")
	private String state;

	@Column(name = "pin_code")
	private Integer pin_code;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "established")
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getEstablished() {
		return established;
	}

	public void setEstablished(LocalDate established) {
		this.established = established;
	}
	
	

}
