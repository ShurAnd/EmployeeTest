package com.andrey.sbet.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andrey.sbet.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findEmployeeByName(String name);
}
