package com.App_Crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.App_Crud.Entity.SignupEntity;


public interface SignupRepository extends JpaRepository<SignupEntity, Long > {

    @Query(value="select user_name from registers where user_name=?1",nativeQuery=true)

    String getUserName(String name);

    

    @Query(value="select password from registers where password=?1",nativeQuery=true)

    String getPassword(String name);

    
	


}