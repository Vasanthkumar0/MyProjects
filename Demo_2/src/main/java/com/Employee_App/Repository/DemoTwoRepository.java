package com.Employee_App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee_App.Entity.DemoTwoEntity;

public interface DemoTwoRepository extends JpaRepository<DemoTwoEntity, Long> {

	DemoTwoEntity findByName(String name);

}
