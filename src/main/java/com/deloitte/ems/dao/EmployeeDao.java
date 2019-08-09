package com.deloitte.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.ems.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	@Query("from Employee where empId=:empId")
	Employee findByEmpId(String empId);
}
