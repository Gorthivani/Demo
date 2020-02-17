package com.capg.cms.services;

import java.util.List;

import com.capg.cms.beans.Customer;
import com.capg.cms.dao.CustomerDAOImp;
import com.capg.cms.dao.ICustomerDAO;

public class CustomerServiceImp implements ICustomerService {
    ICustomerDAO dao=new CustomerDAOImp();
	@Override
	public int addcustomer(Customer c) {
		// TODO Auto-generated method stub
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


		public static boolean isValidCid(int cid) {
			boolean flag=false;
			if(cid!=0 &&(cid>99 && cid<1000)) {
				flag = true;
			}
			
			return false;
			
			
		}
		public static boolean isvalidcName(String cname) {
			boolean flag=false;
			if(cname.length()>=3) {
				flag =true;
				
				
			}
			return false;
			
		}
		public static boolean uservalidations(Customer c) {
			boolean flag =false;
			
			if(isValidCid(c.getCid()) && isvalidcName(c.getCname())){
				flag= true;
				
			}
			return flag;
			
		}
}
