package com.dibs-demo.crm.restfulwebservices.repository;

import com.dibs-demo.crm.restfulwebservices.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
