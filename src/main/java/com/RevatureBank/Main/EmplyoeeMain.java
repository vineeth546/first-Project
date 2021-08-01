package com.RevatureBank.Main;


import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.RevatureBank.bo.CustomerBO;
import com.RevatureBank.bo.CustomerBOImplementation;
import com.RevatureBank.bo.EmployeeBO;
import com.RevatureBank.bo.EmployeeBOImplementation;
import com.RevatureBank.model.Customer;
import com.RevatureBank.model.Employee;

import jdk.internal.org.jline.utils.Log;

	

	public class EmplyoeeMain {
		private static final Logger logger = LogManager.getLogger(EmplyoeeMain.class);
	
		static Scanner sc=new Scanner(System.in);
		public static void newMain() {
			System.out.println("======================================================");
			Log.info("Please enter the required details for Employee Registration:");
			System.out.println("======================================================");
			System.out.println("Enter your Name:");
			String uname = sc.nextLine();
			System.out.println("Enter the Password:");
			String upass=sc.nextLine();
			System.out.println("Enter the Mail Id:");
			String umail=sc.nextLine();
			System.out.println("Enter the Mobile Number:");
			long umob=sc.nextLong();
			Employee emp=new Employee();
			emp.setEmployeeName(uname);
			emp.setPassword(upass);
			emp.setMailId(umail);
			emp.setMobileNumber(umob);
			EmployeeBO ubo=new EmployeeBOImplementation();
			int state=ubo.newUser(emp);
			if(state!=0) {
				Log.info("Details added successfully");
			}else {
				Log.warn("Details Not added successfully");
			}
		}
		public static void existingMain() {
			System.out.println("-----------------------------------------------------");
		Log.info("Employee login page:");
		Log.debug("Enter Employee Id:");
		int exuid=sc.nextInt();
		sc.nextLine();
		Log.debug("Enter the Password:");
		System.out.println("-----------------------------------------------------");
		String exupass=sc.nextLine();
		Employee emp=new Employee();
		emp.setEmployeeId(exuid);
		emp.setPassword(exupass);
		String s=null;
		EmployeeBO ubo=new EmployeeBOImplementation();
		List<Employee> lu=ubo.existingEmployee(exuid);
		for(Employee e:lu) {
			s=e.getPassword();
		}
			if(s.equalsIgnoreCase(exupass)) {
				Log.info("Employee Login Success!");
				System.out.println("1. To Check Customer Account Details");
				
				System.out.println("Please enter your choice");
				int cdetails=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Customer Account Number:");
				long caccount = sc.nextLong();
				Customer cust=new Customer();
				cust.setCustomerAccountNumber(caccount);
				CustomerBO cbo=new CustomerBOImplementation();
				List<Customer> lc=cbo.existingCustomer(caccount);
				for(Customer c:lc) {
					String cname=c.getCustomerName();
					double ccamount=c.getCurrentAmount();
			        double ccredit=c.getCreditedAmount();
			        double cdebit=c.getDebitedAmount();
						switch(cdetails) {
						case 1:
							System.out.println("-----------------------------------------------------");
							System.out.println("CustomerAccountNumber:"+" "+caccount);
							System.out.println("CustomerName:"+" "+cname);
							System.out.println("CurrentAmount:"+" "+ccamount);
							System.out.println("CreditedAmount:"+" "+ccredit);
							System.out.println("DebitedAmount:"+" "+cdebit);
							System.out.println("-----------------------------------------------------");
						    break;
						default:
							Log.warn("Enter Correct Choice!");
						}
						
				}
			}else {
				Log.warn("Employee Login Fail!");
			}
		}			
	}



