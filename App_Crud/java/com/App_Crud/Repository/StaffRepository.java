package com.App_Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App_Crud.Entity.StaffRegister;

public interface StaffRepository extends JpaRepository<StaffRegister, Long> {

}
