package com.employeeManagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeManagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}