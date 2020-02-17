package com.capg.cms.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capg.cms.beans.Customer;
import com.capg.cms.services.CustomerServiceImp;
import com.capg.cms.services.ICustomerService;

public class User {

	private static String amount;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ICustomerService service = new CustomerServiceImp();
		while (true) {
			System.out.println("hello");
			System.out.println("Menu");
			System.out.println("1.AddCustomer");
			System.out.println("2.update");
			System.out.println("3.delete");
			System.out.println("4.selectall");
			System.out.println("5.exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Customer customerbean = new Customer();
				service.addcustomer(customerbean);
				System.out.println("enter customer id");
				int cid=scanner.nextInt();
				 customerbean.getcid(cid);
				 System.out.println("enter name");
				String cname=scanner.next();
				 customerbean.setCname(cname);
				   
				   System.out.println("enter amount");
			    double Amount=scanner.nextDouble();
			    customerbean.setAmount(amount);
			   // LocalDate dop=LocalDate.of()
				   
			  
			  CustomerServiceImp.uservalidations(customerbean);
			  service.addcustomer(customerbean);
			   
				
				
				break;
			case 2:
				

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
				default:
					System.out.println();
				

			}
		}

	}
}
