package com.hp.entity;

import java.util.ArrayList;

public class Clazz {
	private Integer id;
	private String cname;
	//关系属性	根据班级找学生
	private ArrayList<Student> students;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public Clazz(Integer id, String cname, ArrayList<Student> students) {
		super();
		this.id = id;
		this.cname = cname;
		this.students = students;
	}
	public Clazz() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clazz [id=" + id + ", cname=" + cname + ", students="
				+ students + "]";
	}
	
	

}
