package com.MTickets.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MTickets.Entity.Customer;
import com.MTickets.Repository.CustomerRepository;
@Service

public class CustomerService {

	@Autowired
	public CustomerRepository crep;
	public Customer addCustomer(Customer customername)
	{
		return crep.save(customername);
	}
	public List<Customer> getCustomer()
	{
		return crep.findAll();
	}
}
