package com.RevatureBank.bo;

import java.util.List;

import com.RevatureBank.dao.CustomerDAO;
import com.RevatureBank.dao.CustomerDAOImp;
import com.RevatureBank.model.Customer;
import com.RevatureBank.model.CustomerTransaction;



public class CustomerBOImplementation implements CustomerBO{
	CustomerDAO udao=new CustomerDAOImp();
	@Override
	public int newCustomer(Customer cust) {

		//CustomerDAO udao=new CustomerDAOImp();
		int status =udao.newCustomer(cust);
		return status;
	}

	@Override
	public List<Customer> existingCustomer(long customerAccountNumber) {
		//CustomerDAO udao=new CustomerDAOImp();
		List<Customer> status=udao.existingCustomer(customerAccountNumber);
		return status;
	}

	@Override
	public int depoist(long customerAccountNumber, double currentAmount, double creditedAmount) {
		//CustomerDAO udao=new CustomerDAOImp();
		int status =udao.depoist(customerAccountNumber, currentAmount, creditedAmount);
		return status;
	}

	@Override
	public int withdraw(long customerAccountNumber, double currentAmount, double debitedAmount) {

		//CustomerDAO udao=new CustomerDAOImp();
		int status =udao.withdraw(customerAccountNumber, currentAmount, debitedAmount);
		return status;
	}

	@Override
	public List<CustomerTransaction> customerTransaction(long CustomerAccountNumber) {

		//CustomerDAO udao=new CustomerDAOImp();
		List<CustomerTransaction> status=udao.customerTransaction(CustomerAccountNumber);
		return status;
	}

	@Override
	public List<CustomerTransaction> CustomerOperations(long caccount) {

		return null;
	}
}
