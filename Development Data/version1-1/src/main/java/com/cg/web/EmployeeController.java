package com.cg.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.Employee;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.exception.IllegalSecurityQuestionIdException;
import com.cg.exception.WrongPasswordException;
import com.cg.exception.WrongSecurityAnswerException;
import com.cg.service.EmployeeService;

@RestController
@RequestMapping("/capcafe")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping(value = "/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.signUp(employee);
	}

	@GetMapping(value = "/id/{id}")
	public Employee getById(@PathVariable String id) throws EmployeeNotFoundException {
		return service.getById(id);
	}

	@PutMapping(value = "/update")
	public Employee update(@RequestBody Employee employee) {
		return service.update(employee);
	}

	@PutMapping(value = "/chng/{id}/{prevpass}/{newpass}")
	public boolean newPassword(@PathVariable String id, @PathVariable String prevpass, @PathVariable String newpass)
			throws EmployeeNotFoundException, WrongPasswordException {
		return service.newPassword(id, prevpass, newpass);
	}

	@GetMapping(value = "/login/{id}/{password}")
	public Employee login(@PathVariable String id, @PathVariable String password)
			throws EmployeeNotFoundException, WrongPasswordException {
		return service.login(id, password);
	}

	@GetMapping(value = "/all")
	public List<Employee> getAll() {
		return service.getAll();
	}

	@PutMapping(value = "/forgotpassword/{employeeId}/{questionId}/{answer}/{password}")
	public boolean forgotPassword(String employeeId, String questionId, String answer, String password)
			throws EmployeeNotFoundException, WrongSecurityAnswerException, IllegalSecurityQuestionIdException {
		return service.forgotPassword(employeeId, questionId, answer, password);
	}

}
