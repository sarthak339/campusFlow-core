package org.campusflow.sms.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Column(name = "admission_number")
	private String addmissionNumber;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date_of_birth")
	private LocalDate DOB;

	@Column(name = "enrollment_date")
	private LocalDate enrollmentDate;

	@Column(name = "gender")
	private String gender;

	@Column(name = "blood_group")
	private String bloodGroup;

	@Column(name = "student_phone_number")
	private Integer studentPhoneNumber;
	
	@Column(name="password")
	private String password; 

	@Column(name = "father_name")
	private String fatherName;

	@Column(name = "father_profession")
	private String fatherProfession;

	@Column(name = "father_phone_number")
	private String fatherPhoneNumber;

	@Column(name = "mother_name")
	private String motherName;

	@Column(name = "mother_profession")
	private String motherProfession;

	@Column(name = "mother_phone_number")
	private String motherPhoneNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "district")
	private String district;

	@Column(name = "state")
	private String state;
	
	@Column(name="pin_code")
	private Integer pinCode; 
	
	@Column(name="status")
	private String status ; 
	
	@Column(name="school_id")
	private String schoolId; 
	
	@Column(name="class_id")
	private String classId;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getAddmissionNumber() {
		return addmissionNumber;
	}

	public void setAddmissionNumber(String addmissionNumber) {
		this.addmissionNumber = addmissionNumber;
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

	public Integer getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(Integer studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFatherProfession() {
		return fatherProfession;
	}

	public void setFatherProfession(String fatherProfession) {
		this.fatherProfession = fatherProfession;
	}

	public String getFatherPhoneNumber() {
		return fatherPhoneNumber;
	}

	public void setFatherPhoneNumber(String fatherPhoneNumber) {
		this.fatherPhoneNumber = fatherPhoneNumber;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMotherProfession() {
		return motherProfession;
	}

	public void setMotherProfession(String motherProfession) {
		this.motherProfession = motherProfession;
	}

	public String getMotherPhoneNumber() {
		return motherPhoneNumber;
	}

	public void setMotherPhoneNumber(String motherPhoneNumber) {
		this.motherPhoneNumber = motherPhoneNumber;
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

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	} 
	
}
