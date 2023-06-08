package com.TwoDataBase.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TwoDataBase.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
