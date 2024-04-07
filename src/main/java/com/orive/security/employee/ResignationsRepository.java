package com.orive.security.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface ResignationsRepository extends JpaRepository<ResignationsEntity, Long> {

	@Query("SELECT d FROM ResignationsEntity d WHERE d.employeeName = :employeeName")
	Optional<ResignationsEntity> findByEmployeeName(String employeeName);
	
	List<ResignationsEntity> findByUsername(String username);
}
