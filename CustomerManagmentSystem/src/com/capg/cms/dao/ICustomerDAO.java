package com.capg.cms.dao;

import java.util.List;

import com.capg.cms.beans.Customer;

public interface ICustomerDAO {
	int addcustomer(Customer c);

	int updateCustomer(Customer c);

	Customer getCustomerById(int cid);

	int deleteCustomerById(int cid);

	List<Customer> getAllCustomers();
	
}
