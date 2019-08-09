package com.deloitte.ems.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.ems.model.Employee;

@Service
public interface EmployeeService {
	
	public boolean validateEmployee(Employee emp) throws Exception;
	public String generateId(String empName);
	public Employee addEmployee(Employee emp) throws Exception;
	public Employee updateEmployee(Employee emp) throws Exception;
	public boolean deleteEmployee(String empId) throws Exception;
	public Employee getEmployee(String empId) throws Exception;
	public List<Employee> showAllEmployee();
}
