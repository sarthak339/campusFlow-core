package org.campusflow.sms.model;

public class Class {

	private String name;
	private String romanName;
	private Integer classTeacherId;

	public Integer getClassTeacherId() {
		return classTeacherId;
	}

	public void setClassTeacherId(Integer classTeacherId) {
		this.classTeacherId = classTeacherId;
	}

	private Integer SchoolId;

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
		return SchoolId;
	}

	public void setSchoolId(Integer schoolId) {
		SchoolId = schoolId;
	}

}
