package com.project.Entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	
	

	@Id
	@Column(name = "STUDENT_NO")
	private int studentNo;
	
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@Column(name = "STUDENT_DOB")
	private Date studentDOB;
	
	@Column(name = "STUDENT_DOJ")
	private Date studentDOJ;
	
	public Student() {
		super();
	}

	public Student(int studentNo, String studentName, String studentDOB, String studentDOJ) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.studentDOB = Date.valueOf(studentDOB);
		this.studentDOJ = Date.valueOf(studentDOJ);
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(String studentDOB) {
		this.studentDOB=Date.valueOf(studentDOB);
	}

	public Date getStudentDOJ() {
		return studentDOJ;
	}

	public void setStudentDOJ(String studentDOJ) {
		this.studentDOJ=Date.valueOf(studentDOJ);
	}
	
}