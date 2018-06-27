package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tb1_restaurant")
public class Restaurant implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "restaurant_id")
	private long id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="description")
	private String description;
	
	@Column(name="website")
	private String website;
	
	@Column(name="like_count")
	private Integer likecount;
	
	public Restaurant() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getLikecount() {
		return likecount;
	}

	public void setLikecount(Integer likecount) {
		this.likecount = likecount;
	}
	
//	public Restaurant(String ResName, String ResAdd, long ResCon, float ResRat) {
//		this.ResName = ResName;
//		this.ResAdd = ResAdd;
//		this.ResCon = ResCon;
//		this.ResRat = ResRat;
//	}

	
	
	

}
