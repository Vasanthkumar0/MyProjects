package com.Collection.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Collection.Entity.EmployeeAddressEntity;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddressEntity, Long> {

	ArrayList<EmployeeAddressEntity> findByState(String state);

	List<EmployeeAddressEntity> findByStateAndEmployeeEntityName(String state, String name);

}
