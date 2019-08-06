package com.niit.Models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Attendance 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int attendanceId;
private String presentorabsent;
private LocalDate date;
@ManyToOne
private Faculty faculty;
@ManyToOne
private Student student;
@ManyToOne
private Subject subject;
public int getAttendanceId() {
	return attendanceId;
}
public void setAttendanceId(int attendanceId) {
	this.attendanceId = attendanceId;
}
public String getPresentorabsent() {
	return presentorabsent;
}
public void setPresentorabsent(String presentorabsent) {
	this.presentorabsent = presentorabsent;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public Faculty getFaculty() {
	return faculty;
}
public void setFaculty(Faculty faculty) {
	this.faculty = faculty;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	this.subject = subject;
}
@Override
public String toString() {
	return "Attendance [attendanceId=" + attendanceId + ", presentorabsent=" + presentorabsent + ", date=" + date
			+ ", faculty=" + faculty + ", student=" + student + ", subject=" + subject + "]";
}

}
