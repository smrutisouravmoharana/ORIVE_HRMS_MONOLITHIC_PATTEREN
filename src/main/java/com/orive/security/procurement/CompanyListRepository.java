package com.orive.security.procurement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface CompanyListRepository extends JpaRepository<CompanyListEntity, Long> {
   
	List<CompanyListEntity> findByBidAnalysisId(Long bidAnalysisId);

}
