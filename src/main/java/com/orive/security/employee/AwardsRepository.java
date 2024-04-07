package com.orive.security.employee;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AwardsRepository extends JpaRepository<AwardsEntity, Long>{
	
	//Query for find Awards By employeeId;
			@Query("SELECT a FROM AwardsEntity a WHERE a.username = :username")
			List<AwardsEntity> findAwardsByEmployeeId(@Param("username") String username);
	
}
