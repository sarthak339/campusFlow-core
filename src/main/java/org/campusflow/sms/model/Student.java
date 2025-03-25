package org.campusflow.sms.model;

import java.time.LocalDate;

public class Student {
	private Integer Id;
	private String admissionNumber;
	private String UserId;
	private String firstName;
	private String lastName;
	private LocalDate DOB;
	private LocalDate enrollmentDate;
	private String gender;
	private String bloodGroup;
	private String StudentPhoneNumnber;
	private String password;
	private String FatherName;
	private String FatherProfession;
	private String FatherPhoneNumber;
	private String MotherName;
	private String MotherProfession;
	private String MotherPhoneNumber;
	private String address;
	private String district;
	private String state;
	private String pinCode;
	private String status;
	private Integer class_id;
	private Integer school_id;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getStudentPhoneNumnber() {
		return StudentPhoneNumnber;
	}

	public void setStudentPhoneNumnber(String studentPhoneNumnber) {
		StudentPhoneNumnber = studentPhoneNumnber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getFatherProfession() {
		return FatherProfession;
	}

	public void setFatherProfession(String fatherProfession) {
		FatherProfession = fatherProfession;
	}

	public String getFatherPhoneNumber() {
		return FatherPhoneNumber;
	}

	public void setFatherPhoneNumber(String fatherPhoneNumber) {
		FatherPhoneNumber = fatherPhoneNumber;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public String getMotherProfession() {
		return MotherProfession;
	}

	public void setMotherProfession(String motherProfession) {
		MotherProfession = motherProfession;
	}

	public String getMotherPhoneNumber() {
		return MotherPhoneNumber;
	}

	public void setMotherPhoneNumber(String motherPhoneNumber) {
		MotherPhoneNumber = motherPhoneNumber;
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

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Integer getClass_id() {
		return class_id;
	}

	public void setClass_id(Integer class_id) {
		this.class_id = class_id;
	}

	public Integer getSchool_id() {
		return school_id;
	}

	public void setSchool_id(Integer school_id) {
		this.school_id = school_id;
	}

	public String getAdmissionNumber() {
		return admissionNumber;
	}

	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
