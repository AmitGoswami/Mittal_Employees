package com.employees.models;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5532973251934855386L;

	private int age;
	private Contact contactInfo;
	private Long employeeId;
	private Gender gender;
	private Level level;
	private String name;
	private String photo;
	private String positionTitle;
	private Date startDate;
	private String teamInfo;

	public Employee(int age, Contact contactInfo, Long employeeId, Gender gender, Level level, String name,
			String photo, String positionTitle, Date startDate, String teamInfo) {
		super();
		this.age = age;
		this.contactInfo = contactInfo;
		this.employeeId = employeeId;
		this.gender = gender;
		this.level = level;
		this.name = name;
		this.photo = photo;
		this.positionTitle = positionTitle;
		this.startDate = startDate;
		this.teamInfo = teamInfo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Contact getContactInfo() {
		return contactInfo;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public Gender getGender() {
		return gender;
	}

	public Level getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public String getPhoto() {
		return photo;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public String getTeamInfo() {
		return teamInfo;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setTeamInfo(String teamInfo) {
		this.teamInfo = teamInfo;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", gender=" + gender + ", startDate="
				+ startDate + ", level=" + level + ", teamInfo=" + teamInfo + ", positionTitle=" + positionTitle
				+ ", contactInfo=" + contactInfo + "]";
	}
}
