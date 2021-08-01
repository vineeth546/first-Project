package com.RevatureBank.dao;

import java.util.List;

import com.RevatureBank.model.Customer;
import com.RevatureBank.model.CustomerTransaction;



public interface CustomerDAO {
	public int newCustomer(Customer cust);
	public List<Customer> existingCustomer(long customerAccountNumber);
	public int depoist(long customerAccountNumber, double currentAmount, double creditedAmount);
	public int withdraw(long customerAccountNumber, double currentAmount, double debitedAmount);
	public List<CustomerTransaction> customerTransaction(long customerAccountNumber);
}

