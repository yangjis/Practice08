package com.javaex.ex08;

public class Friend {
	
	private String name;
	private String phone;
	private String school;
	
	public Friend() {}
	public Friend(String name, String phone, String school) {
		this.name = name;
		this.phone = phone;
		this.school = school;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public void info() {
		System.out.println("이름:" + this.name + " 핸드폰:" + this.phone + " 학교:" + this.school);
	}

}
