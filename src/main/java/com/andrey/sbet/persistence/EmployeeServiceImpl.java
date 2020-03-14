package com.andrey.sbet.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrey.sbet.domain.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository repository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Employee findEmployeeByName(String name) {
		// find employee by given name
		return repository.findEmployeeByName(name);
	}

	@Override
	public Employee findEmployeeById(Long id) {
		// find employee by given id
		return repository.getOne(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		// find all employees and returns them within list
		return repository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// save employee into db
		return repository.save(employee);
	}

}
