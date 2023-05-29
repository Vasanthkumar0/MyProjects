package com.Collection.Repository;

import java.util.LinkedList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Collection.Entity.ListEntity;

@Repository
public interface ListRepository extends JpaRepository<ListEntity, Long> {

	LinkedList<ListEntity> findByName(String name);

}
