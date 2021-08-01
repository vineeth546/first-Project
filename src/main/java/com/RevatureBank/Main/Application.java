package com.RevatureBank.Main;

import java.util.List;
import java.util.Scanner;

import com.RevatureBank.bo.CustomerBO;
import com.RevatureBank.bo.CustomerBOImplementation;
import com.RevatureBank.model.CustomerTransaction;

import jdk.internal.org.jline.utils.Log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {
	
	private static final Logger logger = LogManager.getLogger(Application.class);
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("=====================================================================");
			System.out.println("----------------------Welcome to Canara Bank------------------------");
			System.out.println("=====================================================================");
			while(true) {
			System.out.println("1. EmployeeRegistration");
			System.out.println("2. Employee Login");
			System.out.println("3. New Customer Registrion");
			System.out.println("4. Customer Login");
			System.out.println("5 . Transaction Details:");
	        int input=sc.nextInt();
	        sc.nextLine();
	        switch(input) {
	        case 1:
	        	EmplyoeeMain.newMain();
	        	break;
	        case 2:
	        	EmplyoeeMain.existingMain();
	        	break;
	        case 3:
	        	CustomerMain.newCustomer();
	        	break;
	        case 4:
	        	CustomerMain.existingCustomer();
	        	break;
	        case 5:
	        	System.out.println("Enter Account Number:");
	    		long caccount = sc.nextLong();
	        	CustomerTransaction cus=new CustomerTransaction();
				cus.setCustomerAccountNumber(caccount);
				CustomerBO cbo=new CustomerBOImplementation();
				List<CustomerTransaction> lc=cbo.customerTransaction(caccount);
				for(CustomerTransaction c:lc) {
					//double ccamount=c.getCurrentAmount();
			        double ccredit1=c.getCreditedAmount();
			        double cdebit1=c.getDebitedAmount();
			        System.out.println("CustomerAccountNumber:"+" "+caccount);
					//System.out.println("CurrentAmount:"+" "+ccamount);
					System.out.println("CreditedAmount:"+" "+ccredit1);
					System.out.println("DebitedAmount:"+" "+cdebit1);
					System.out.println("***********");
				}
	        default:
	        	System.out.println("Please enter correct choice!");
	        	break;
	        }
	}	
}
}