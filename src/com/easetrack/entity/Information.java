package com.easetrack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "information")
public class Information {
	

	
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	
	

	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name = "phonenumber")
	private String phonenumber;
	
	
	@Column(name = "status")
	private String status;
	
	
	
	public Information(int id, String firstname, String lastname, String email,
			String phonenumber, String status) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.status = status;
	}






	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public String getFirstname() {
		return firstname;
	}






	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}






	public String getLastname() {
		return lastname;
	}






	public void setLastname(String lastname) {
		this.lastname = lastname;
	}






	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public String getPhonenumber() {
		return phonenumber;
	}






	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}






	public String getStatus() {
		return status;
	}






	public void setStatus(String status) {
		this.status = status;
	}






	
	


	
	public static String getAllColumns(String prefix) {
		String ret = "";
		ret += prefix + ".id" + ", ";
		ret += prefix + ".firstname" + ", ";
		ret += prefix + ".lastname" + " ,";
		ret += prefix + ".email" + ",";
		ret += prefix + ".phonenumber" + ",";
		ret += prefix + ".status" + " ";
		
		return ret;

	}

}
