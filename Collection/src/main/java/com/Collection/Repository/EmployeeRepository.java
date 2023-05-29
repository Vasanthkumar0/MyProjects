package com.Collection.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Collection.Entity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

	ArrayList<EmployeeEntity> findByName(String name);

	ArrayList<EmployeeEntity> findByNameAndEmployeeState(String name, String state);

	ArrayList<EmployeeEntity> findByEmployee_StateAndName(String state, String name);

}
