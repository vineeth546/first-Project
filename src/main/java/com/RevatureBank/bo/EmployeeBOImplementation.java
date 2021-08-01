package com.RevatureBank.bo;

import java.util.List;

import com.RevatureBank.dao.EmployeeDAO;

import com.RevatureBank.dao.EmployeeDaoImplementation;
import com.RevatureBank.model.Employee;




public class EmployeeBOImplementation implements EmployeeBO{
	EmployeeDAO udao=new EmployeeDaoImplementation();

	@Override
	public int newUser(Employee emp) {
		//EmployeeDAO udao=new EmployeeDaoImplementation();
		int status =udao.newEmployee(emp);
		return status;
	}

	@Override
	public List<Employee> existingEmployee(int EmployeeId) {

		//EmployeeDAO udao=new EmployeeDaoImplementation();
		List<Employee> status=udao.existingEmployee(EmployeeId);
		return status;
	}

}
