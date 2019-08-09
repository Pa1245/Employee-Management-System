package com.deloitte.ems.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.ems.dao.EmployeeDao;
import com.deloitte.ems.model.Employee;
import com.deloitte.ems.util.InvalidDateException;
import com.deloitte.ems.util.InvalidLengthException;
import com.deloitte.ems.util.InvalidSalaryException;

import javassist.NotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao ed;
	
	@Override
	public boolean validateEmployee(Employee emp) throws Exception {
		
		if(emp.getEmpName().length() < 4 || emp.getEmpName().length() > 15)
			throw new InvalidLengthException("Invalid length");
		
		if(emp.getDob().isAfter(LocalDate.of(1995, 12, 31)) || emp.getDob().isBefore(LocalDate.of(1900, 01, 01)))
			throw new InvalidDateException("Invalid Date");
		
		if(emp.getBasicSalary() < 20000 || emp.getBasicSalary() > 80000)
			throw new InvalidSalaryException("Invalid Salary");
		
		return true;
	}
	
	@Override
	public String generateId(String empName) {
		Random rand = new Random();
		return empName.substring(0, 2).toUpperCase() + String.format("%04d", rand.nextInt(10000));
	}
	
	@Override
	public Employee addEmployee(Employee emp) throws Exception {
		if(validateEmployee(emp)) {
			emp.setEmpId(generateId(emp.getEmpName()));
			return ed.save(emp);
		}
		return null;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws Exception {
		Employee e = ed.findByEmpId(emp.getEmpId().toUpperCase());
		if(e != null) {
			e.setBasicSalary(emp.getBasicSalary());
			if (validateEmployee(e))
				return ed.save(e);
		} else {
			throw new NotFoundException("Employee not Found");
		}
		return null;
	}

	@Override
	public boolean deleteEmployee(String empId) throws Exception {
		Employee e = ed.findByEmpId(empId.toUpperCase());
		if (e != null) {
			ed.delete(e);
			return true;
		} else {
			throw new NotFoundException("Employee not Found");
		}
	}

	@Override
	public Employee getEmployee(String empId) throws Exception {
		Employee e = ed.findByEmpId(empId.toUpperCase());
		if (e != null)
			return e;
		else
			throw new NotFoundException("Employee Not Found");
	}

	@Override
	public List<Employee> showAllEmployee() {
		return ed.findAll();
	}

}
