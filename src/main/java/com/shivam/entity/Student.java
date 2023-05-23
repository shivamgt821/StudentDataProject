package com.shivam.entity;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	private String std;
	private String sec;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", sec=" + sec + "]";
	} 
}