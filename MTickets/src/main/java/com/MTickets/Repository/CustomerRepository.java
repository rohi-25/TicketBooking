package com.MTickets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MTickets.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
	@Query(value="select c from Customer c join c.product p")
	List<Customer>getCustomer();
}