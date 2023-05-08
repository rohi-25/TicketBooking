package com.MTickets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MTickets.Entity.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{

}
