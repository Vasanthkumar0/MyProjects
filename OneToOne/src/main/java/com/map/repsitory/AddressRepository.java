package com.map.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Adrs;

public interface AddressRepository extends JpaRepository<Adrs, Long> {

}
