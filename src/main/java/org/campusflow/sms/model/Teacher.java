package org.campusflow.sms.model;




public class Teacher {
	
	
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
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public Integer getIsClassTeacher() {
		return isClassTeacher;
	}
	public void setIsClassTeacher(Integer isClassTeacher) {
		this.isClassTeacher = isClassTeacher;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}
private String firstName ;
 private String lastName ; 
 private Integer schoolId ; 
 private Integer isClassTeacher; 
 private Integer subjectId; 

}
