package com.hp.entity;

public class Person {
	private Integer id;
	private String name;
	private String sex;
	private String phone;
	//关系属性	一个人有一个身份证  根据人的信息查找身份证信息
	private IdCard ic;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public IdCard getIc() {
		return ic;
	}
	public void setIc(IdCard ic) {
		this.ic = ic;
	}
	public Person(Integer id, String name, String sex, String phone, IdCard ic) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.ic = ic;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", phone=" + phone + ", ic=" + ic + "]";
	}


}
