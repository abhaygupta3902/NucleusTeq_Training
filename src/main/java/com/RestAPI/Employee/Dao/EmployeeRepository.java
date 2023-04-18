package com.RestAPI.Employee.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestAPI.Employee.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
