package com.karina.many_to_many;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	String sname;
	int scode;
	
	@JsonBackReference
	@ManyToMany(cascade=CascadeType.ALL)
	List<Branch> branch;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getScode() {
		return scode;
	}

	public void setScode(int scode) {
		this.scode = scode;
	}

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}
	
	
}
