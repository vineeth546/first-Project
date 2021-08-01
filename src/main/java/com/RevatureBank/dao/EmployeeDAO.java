package com.RevatureBank.dao;

import java.util.List;

import com.RevatureBank.model.Employee;



public interface EmployeeDAO {
	public int newEmployee(Employee emp);
	public List<Employee> existingEmployee(int EmployeeId);
}
