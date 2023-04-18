package com.RestAPI.Employee.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.Employee.Entity.Employee;
import com.RestAPI.Employee.Exception.ResourceNotFoundException;
import com.RestAPI.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return this.employeeService.getAllEmployee();
	}
	
	@GetMapping("/employees/{id}")
	public /*ResponseEntity<Employee>*/String getEmployeeById(@PathVariable Long id)
	{	
		try
		{
			ResponseEntity<Employee> employee = this.employeeService.getEmployeeById(id);
			return ""+employee;
		}
		catch(ResourceNotFoundException e)
		{
			return e.getMessage();
		}
		//return null;
		
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employee)
	{
		try
		{
			ResponseEntity<Employee> updatedEmployee = this.employeeService.updateEmployee(id,employee);
			return updatedEmployee;
		}
		catch(ResourceNotFoundException e)
		{
			//return e.getMessage();
		}
		return null;
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id)
	{
		return this.employeeService.deleteEmployee(id);
	}
}
