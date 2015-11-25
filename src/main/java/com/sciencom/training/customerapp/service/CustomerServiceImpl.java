package com.sciencom.training.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sciencom.training.customerapp.dao.CustomerDao;
import com.sciencom.training.customerapp.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDao customerDao;
	
	public void create(Customer customer) {
		String temp = customer.getPhone();
		temp.replace("-", "");
		temp.replace(" ", "");
		temp.replace("+62", "0");
		customer.setPhone(temp);
		customerDao.create(customer);
	}

	public List<Customer> read() {
		return customerDao.read();
	}

	public Customer getById(String id) {
		return customerDao.getById(id);
	}

}
