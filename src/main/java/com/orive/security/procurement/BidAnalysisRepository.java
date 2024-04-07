package com.orive.security.procurement;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface BidAnalysisRepository extends JpaRepository<BidAnalysisEntity, Long> {

	//find by location method
	Optional<BidAnalysisEntity> findByLocation(String location);
}
