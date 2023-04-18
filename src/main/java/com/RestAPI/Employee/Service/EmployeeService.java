package com.RestAPI.Employee.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.RestAPI.Employee.Entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List getAllEmployee();

	ResponseEntity<Employee> getEmployeeById(Long id);

	ResponseEntity<Employee> updateEmployee(Long id,Employee employee);

	ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);

}
