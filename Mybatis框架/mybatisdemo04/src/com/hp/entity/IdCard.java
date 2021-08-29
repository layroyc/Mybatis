package com.hp.entity;

public class IdCard {
	private Integer id;
	private String photo;
	private String address;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public IdCard(Integer id, String photo, String address) {
		super();
		this.id = id;
		this.photo = photo;
		this.address = address;
	}
	public IdCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IdCard [id=" + id + ", photo=" + photo + ", address=" + address
				+ "]";
	}
	

}
