package com.niit.Models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Faculty 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int facultyID;
	private String factName;
	private String factPwd;
	private String factEmail;
	private String factAddr;
	private String factPhone;
	private String factCity;
	private String factGender;
	private String factQual;
	private String DateOfBirth;
	@OneToOne
	private Login login;
	@OneToOne
	private Subject subject;
	public int getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(int facultyID) {
		this.facultyID = facultyID;
	}
	public String getFactName() {
		return factName;
	}
	public void setFactName(String factName) {
		this.factName = factName;
	}
	public String getFactPwd() {
		return factPwd;
	}
	public void setFactPwd(String factPwd) {
		this.factPwd = factPwd;
	}
	public String getFactEmail() {
		return factEmail;
	}
	public void setFactEmail(String factEmail) {
		this.factEmail = factEmail;
	}
	public String getFactAddr() {
		return factAddr;
	}
	public void setFactAddr(String factAddr) {
		this.factAddr = factAddr;
	}
	public String getFactPhone() {
		return factPhone;
	}
	public void setFactPhone(String factPhone) {
		this.factPhone = factPhone;
	}
	public String getFactCity() {
		return factCity;
	}
	public void setFactCity(String factCity) {
		this.factCity = factCity;
	}
	public String getFactGender() {
		return factGender;
	}
	public void setFactGender(String factGender) {
		this.factGender = factGender;
	}
	public String getFactQual() {
		return factQual;
	}
	public void setFactQual(String factQual) {
		this.factQual = factQual;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "Faculty [facultyID=" + facultyID + ", factName=" + factName + ", factPwd=" + factPwd + ", factEmail="
				+ factEmail + ", factAddr=" + factAddr + ", factPhone=" + factPhone + ", factCity=" + factCity
				+ ", factGender=" + factGender + ", factQual=" + factQual + ", DateOfBirth=" + DateOfBirth + ", login="
				+ login + ", subject=" + subject + "]";
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
	
	
	
}
