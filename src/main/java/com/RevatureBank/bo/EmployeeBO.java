package com.RevatureBank.bo;


import java.util.List;

import com.RevatureBank.model.Employee;



public interface EmployeeBO {
	public int newUser(Employee emp);
	public List<Employee> existingEmployee(int EmployeeeId);
}

