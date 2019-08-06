package com.niit.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Login 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loginID;	
	private String loginName;	
	private String loginPassword;
	@OneToOne
	private Role role;
	public int getLoginID() {
		return loginID;
	}
	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Login [loginID=" + loginID + ", loginName=" + loginName + ", loginPassword=" + loginPassword + ", role="
				+ role + "]";
	}
	
	
	
	
	
}
