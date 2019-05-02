package com.dynamisch.main.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.JoinColumn;

@Entity
public class Admin implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	private String aemail;
	private String apass;
	private String gender;
	private String address;
	private long phone;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "admin_id")
	private List<Roles>roles;
	
	
	
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getApass() {
		return apass;
	}
	public void setApass(String apass) {
		this.apass = apass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aemail=" + aemail + ", apass=" + apass + ", gender=" + gender + ", address="
				+ address + ", phone=" + phone + "]";
	}
	
	
}
