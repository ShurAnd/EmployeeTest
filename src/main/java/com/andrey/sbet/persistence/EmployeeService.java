package com.andrey.sbet.persistence;

import java.util.List;

import com.andrey.sbet.domain.Employee;

public interface EmployeeService {

	Employee findEmployeeByName(String name);
	Employee findEmployeeById(Long id);
	List<Employee> findAllEmployees();
	Employee saveEmployee(Employee employee);
}
