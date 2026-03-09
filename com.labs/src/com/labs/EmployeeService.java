package com.labs;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

	public double sumOfSalary() {
		double totalSal = EmployeeRepository.getEmployees().stream().map(e -> e.getSalary())
				.collect(Collectors.summingDouble(e -> e));
		return totalSal;
	}

	public Map<String, Long> countNoOfEmployeeByDept() {

		Map<String, Long> m = EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() != null)
				.map(e -> e.getDepartment().getDepartmentName())
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		return m;

	}

	// senior most employee

	public Employee getSeniorMostEmployee() {

		return EmployeeRepository.getEmployees().stream().min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
				.get();

	}

	public List<Employee> getEmployeeWithoutDept() {

		return EmployeeRepository.getEmployees().stream().filter(e -> e.getDepartment() == null)
				.collect(Collectors.toList());

	}

	public Map<String, Period> getEmployeeWithDuration() {
		Map<String, Period> map = EmployeeRepository.getEmployees().stream().collect(
				Collectors.toMap(e -> e.getFirstName(), e -> Period.between(e.getHireDate(), LocalDate.now())));
		return map;
	}

}
