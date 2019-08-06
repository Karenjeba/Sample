package com.niit.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Subject 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int subId;
private String subName;
@ManyToOne
private Semester semester;
public int getSubId() {
	return subId;
}
public void setSubId(int subId) {
	this.subId = subId;
}
public String getSubName() {
	return subName;
}
public void setSubName(String subName) {
	this.subName = subName;
}
public Semester getSemester() {
	return semester;
}
public void setSemester(Semester semester) {
	this.semester = semester;
}
@Override
public String toString() {
	return "Subject [subId=" + subId + ", subName=" + subName + ", semester=" + semester + ", ]";
}



}
