package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb1_user")


public class User implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private long id;

	@Column(name="name")
	private String name;
	@Column(name="mobile")
	private String mobile;
	@Column(name="address")
	private String address;
	@Column(name="password")
	private String password;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private String pincode;
	
	public User() {
		
	}
	
	public User(String name, String mobile, String address, String password, String landmark, String pincode) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.password = password;
		this.landmark = landmark;
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
