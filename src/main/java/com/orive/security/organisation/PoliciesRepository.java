package com.orive.security.organisation;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface PoliciesRepository extends JpaRepository<PoliciesEntity, Long>{

	@Query("SELECT d FROM PoliciesEntity d WHERE d.title = :title")
	Optional<PoliciesEntity> findByPoliciesTittle(String title);
}
