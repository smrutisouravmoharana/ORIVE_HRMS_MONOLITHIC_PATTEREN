package com.orive.security.organisation;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long>{

	@Query("SELECT d FROM DepartmentEntity d WHERE d.departmentName = :departmentName")
	Optional<DepartmentEntity> findByDepartmentName(String departmentName);
	

}
