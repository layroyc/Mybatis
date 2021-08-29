package com.hp.entity;

public class Student {
	private Integer id;
	private String username;
	private String sex;
	private Integer cid;
	//πÿœµ Ù–‘
	private Clazz zz;
	
	public Clazz getZz() {
		return zz;
	}
	public void setZz(Clazz zz) {
		this.zz = zz;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String username, String sex, Integer cid,
			Clazz zz) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.cid = cid;
		this.zz = zz;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", sex=" + sex
				+ ", cid=" + cid + ", zz=" + zz + "]";
	}
	
	
	

}
