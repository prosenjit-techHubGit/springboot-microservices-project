package io.pivotal.service;

import java.util.Comparator;

import io.pivotal.domain.Employee;

public class ComparatorService {

	public static Comparator<Employee> EmployeeFirsNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			return emp1.getEmpFirstName().compareTo(emp2.getEmpFirstName());
		}

	};

	public static Comparator<Employee> EmployeeLastNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee emp1, Employee emp2) {

			return emp1.getEmpLastName().compareTo(emp2.getEmpLastName());
		}

	};

	public static Comparator<Employee> LambdaEmployeeFirstNameComparator = (emp1, emp2) ->

	emp1.getEmpFirstName().compareTo(emp2.getEmpFirstName());

}
