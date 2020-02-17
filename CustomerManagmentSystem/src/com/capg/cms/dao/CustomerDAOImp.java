package com.capg.cms.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.util.List;

import com.capg.cms.beans.Customer;

public class CustomerDAOImp implements ICustomerDAO {
	Connection conn=DBUtil.getDBConnection();

	@Override
	public int addcustomer(Customer c) {
		PreparedStatement pstmt=conn.prepareStatement(IQueryMapper.Insert_cust_query);
		return 0;
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer getCustomerById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerById(int cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
