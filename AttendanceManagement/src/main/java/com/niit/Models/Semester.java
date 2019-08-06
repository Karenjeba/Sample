package com.niit.Models;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Semester
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int semID;
private String semName;
private int noofsubjects;
private LocalDate startDate;
private LocalDate endDate;

public int getSemID() {
	return semID;
}
public void setSemID(int semID) {
	this.semID = semID;
}
public String getSemName() {
	return semName;
}
public void setSemName(String semName) {
	this.semName = semName;
}
public int getNoofsubjects() {
	return noofsubjects;
}
public void setNoofsubjects(int noofsubjects) {
	this.noofsubjects = noofsubjects;
}
public LocalDate getStartDate() {
	return startDate;
}
public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}
public LocalDate getEndDate() {
	return endDate;
}
public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "Semester [semID=" + semID + ", semName=" + semName + ", noofsubjects=" + noofsubjects + ", startDate="
			+ startDate + ", endDate=" + endDate + "]";
}



}
