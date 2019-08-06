package com.niit.Models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int studentID;
private String studentName;
private String studentEmail;
private String studentdob;
private String studentAddr;
private String parentPhone;
private String studentPhone;
private String studentGender;
private String studentCity;
private String course;
@ManyToOne
private Semester semester;
//@OneToMany(mappedBy="attendance")
//List<Attendance> attendance;

public int getStudentID() {
	return studentID;
}
public void setStudentID(int studentID) {
	this.studentID = studentID;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentEmail() {
	return studentEmail;
}
public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}
public String getStudentAddr() {
	return studentAddr;
}
public void setStudentAddr(String studentAddr) {
	this.studentAddr = studentAddr;
}
public String getParentPhone() {
	return parentPhone;
}
public void setParentPhone(String parentPhone) {
	this.parentPhone = parentPhone;
}
public String getStudentPhone() {
	return studentPhone;
}
public void setStudentPhone(String studentPhone) {
	this.studentPhone = studentPhone;
}
public String getStudentGender() {
	return studentGender;
}
public void setStudentGender(String studentGender) {
	this.studentGender = studentGender;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Semester getSemester() {
	return semester;
}
public void setSemester(Semester semester) {
	this.semester = semester;
}
public String getStudentdob() {
	return studentdob;
}
public void setStudentdob(String studentdob) {
	this.studentdob = studentdob;
}
@Override
public String toString() {
	return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentEmail=" + studentEmail
			+ ", studentdob=" + studentdob + ", studentAddr=" + studentAddr + ", parentPhone=" + parentPhone
			+ ", studentPhone=" + studentPhone + ", studentGender=" + studentGender + ", studentCity=" + studentCity
			+ ", course=" + course + ", semester=" + semester + ", attendance=" +/* attendance +*/ "]";
}
/*public List<Attendance> getAttendance() {
	return attendance;
}
public void setAttendance(List<Attendance> attendance) {
	this.attendance = attendance;
}*/




}
