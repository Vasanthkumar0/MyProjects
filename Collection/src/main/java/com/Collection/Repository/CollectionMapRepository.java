package com.Collection.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Collection.Entity.CollectionMap;

@Repository
public interface CollectionMapRepository extends JpaRepository<CollectionMap, Long> {


	
	

}
