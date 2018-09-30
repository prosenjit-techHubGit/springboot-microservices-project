package io.pivotal.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.pivotal.domain.Employee;
import io.pivotal.service.ComparatorService;
import io.pivotal.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		List<Employee> empList = employeeService.getEmployees("CTS");
		Collections.sort(empList, (emp1, emp2) ->

		emp1.getEmpLastName().compareTo(emp2.getEmpLastName()));
		return empList;

	}

}
