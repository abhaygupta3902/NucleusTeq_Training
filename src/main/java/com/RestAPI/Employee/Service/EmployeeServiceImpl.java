package com.RestAPI.Employee.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.RestAPI.Employee.Dao.EmployeeRepository;
import com.RestAPI.Employee.Entity.Employee;
import com.RestAPI.Employee.Exception.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}


	@Override
	public ResponseEntity<Employee> getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id :" + id));
		return ResponseEntity.ok(employee);
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Long id,Employee employeeDetails) {
		// TODO Auto-generated method stub
		Employee employee = employeeRepository.findById(id)
							.orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id :" + id));
		
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		

		return ResponseEntity.ok(employeeRepository.save(employee));
	}

	@Override
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(( )-> new ResourceNotFoundException("Employee does not exist with id :" + id));
		
		employeeRepository.delete(employee);
		Map<String , Boolean> response = new HashMap<>();
		response.put("deleted", true);
		return ResponseEntity.ok(response);
	}

}
