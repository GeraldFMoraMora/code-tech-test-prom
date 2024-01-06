package com.test.tech.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.tech.model.entity.Customer;

public interface ClientDao extends JpaRepository<Customer, String>{
    
}
