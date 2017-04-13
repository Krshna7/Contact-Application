package com.easetrack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items {

	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;

	@Column(name = "itemname")
	private String itemname;

	@Column(name = "shortdesc")
	private String shortdesc;

	@Column(name = "longdesc")
	private String longdesc;

	@Column(name = "status")
	private String status;

	

	public Items(int id, String itemname, String shortdesc, String longdesc,
			String status) {
		super();
		this.id = id;
		this.itemname = itemname;
		this.shortdesc = shortdesc;
		this.longdesc = longdesc;
		this.status = status;
	}



	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getItemname() {
		return itemname;
	}



	public void setItemname(String itemname) {
		this.itemname = itemname;
	}



	public String getShortdesc() {
		return shortdesc;
	}



	public void setShortdesc(String shortdesc) {
		this.shortdesc = shortdesc;
	}



	public String getLongdesc() {
		return longdesc;
	}



	public void setLongdesc(String longdesc) {
		this.longdesc = longdesc;
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
		ret += prefix + ".itemname" + ", ";
		ret += prefix + ".shortdesc" + " ,";
		ret += prefix + ".longdesc" + ",";
		
		ret += prefix + ".status" + " ";

		return ret;

	}

}
