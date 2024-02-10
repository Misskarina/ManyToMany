package com.karina.many_to_many;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bid;
	String bname;
	String bshortname;
	int bcode;
		
	@ManyToMany(cascade=CascadeType.ALL)
	List<Subject> subject;


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getBshortname() {
		return bshortname;
	}


	public void setBshortname(String bshortname) {
		this.bshortname = bshortname;
	}


	public int getBcode() {
		return bcode;
	}


	public void setBcode(int bcode) {
		this.bcode = bcode;
	}


	public List<Subject> getSubject() {
		return subject;
	}


	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	

}
