package com.tech.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tech.customer.entity.Customer;

@Repository
public interface IRepositoryCustomer extends JpaRepository<Customer, Long>{
	@Query("SELECT AVG(u.age) FROM customer u")
	Double average();
	@Query("SELECT STDDEV(u.age) FROM customer u")
	Double standardDeviation();
}
