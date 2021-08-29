package com.hp.entity;

public class User {
	private Integer uid;
	private String uname;
	private String upassword;
	private Integer age;
	private String sex;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User(Integer uid, String uname, String upassword, Integer age,
			String sex) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.age = age;
		this.sex = sex;
	}
	
	public User(String uname, String upassword, Integer age, String sex) {
		super();
		this.uname = uname;
		this.upassword = upassword;
		this.age = age;
		this.sex = sex;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword="
				+ upassword + ", age=" + age + ", sex=" + sex + "]";
	}
	

}
