package com.orive.security.procurement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CommitteeListRepository extends JpaRepository<CommitteeListEntity, Long> {
	
	List<CommitteeListEntity> findByBidAnalysisId(Long bidAnalysisId);
}
