package com.cg.service;

import java.util.List;

import com.cg.dto.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.exception.IllegalSecurityQuestionIdException;
import com.cg.exception.WrongPasswordException;
import com.cg.exception.WrongSecurityAnswerException;

public interface EmployeeService {
	Employee signUp(Employee employee);

	// employee not found
	Employee getById(String id) throws EmployeeNotFoundException;

	Employee update(Employee employee);

	// employee not found
	// prev pass does not match
	boolean newPassword(String id, String prevpass, String newpass)
			throws EmployeeNotFoundException, WrongPasswordException;

	// employee not found
	boolean deleteById(String id) throws EmployeeNotFoundException;

	// employee not found
	// question id not found
	// answer does not match
	boolean forgotPassword(String employeeId, String questionId, String answer, String password)
			throws EmployeeNotFoundException, WrongSecurityAnswerException, IllegalSecurityQuestionIdException;

	// wrong password
	// id not found
	Employee login(String id, String password) throws EmployeeNotFoundException, WrongPasswordException;

	List<Employee> getAll();

}
