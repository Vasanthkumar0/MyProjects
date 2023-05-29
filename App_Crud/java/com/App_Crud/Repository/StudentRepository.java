package com.App_Crud.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.App_Crud.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
	@Query(value="select * from student.students where id=?1",nativeQuery=true)
	Student getDataById(String id);

	@Query(value="select id from student.students where id=?1",nativeQuery=true)
	Long getIdByName(long id);



	
	
}



