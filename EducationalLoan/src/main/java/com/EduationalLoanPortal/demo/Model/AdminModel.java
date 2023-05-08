package com.EduationalLoanPortal.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity


public class AdminModel {
	
	@Id
	private String email;
	private String password;
	private String pobileNumber;
	private String userRole;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPobileNumber() {
		return pobileNumber;
	}
	public void setPobileNumber(String pobileNumber) {
		this.pobileNumber = pobileNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	

}
