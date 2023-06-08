package com.ExcelSaveData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExcelSaveData.entity.ExcelEntity;


/**@author vasanth*/
public interface ExcelRepository extends JpaRepository<ExcelEntity, Long> {

}
