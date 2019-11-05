package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Master")
public class Employee {

	@Id
	@Column(name = "Employee_Id", length = 20)
	private String employeeId;
	@Column(name = "Employee_Name", length = 20)
	private String employeeName;
	@Column(name = "Employee_Password", length = 256)
	private String employeePassword;
	@Column(name = "Employee_Phone", length = 20)
	private String employeePhone;
	@Column(name = "Employee_Mail", length = 50)
	private String employeeMail;
	@Column(name = "Employee_Role", length = 20)
	private String employeeRole;
	@Column(name = "Question_Id", length = 10)
	private String questionId;
	@Column(name = "Answer", length = 50)
	private String answer;
	@Transient
	private String confirmPassword;

	public Employee() {
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeMail() {
		return employeeMail;
	}

	public void setEmployeeMail(String employeeMail) {
		this.employeeMail = employeeMail;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
