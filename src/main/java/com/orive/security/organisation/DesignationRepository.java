package com.orive.security.organisation;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface DesignationRepository extends JpaRepository<DesignationEntity, Long>{

	@Query("SELECT d FROM DesignationEntity d WHERE d.designationName = :designationName")
	Optional<DesignationEntity> findByDesignationName(String designationName);
}
