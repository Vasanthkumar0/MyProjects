package com.App_shop.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.App_shop.Entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(name = "select * from onetomany.customers where name=?1")
	List<Customer> findByName(String name);
}
