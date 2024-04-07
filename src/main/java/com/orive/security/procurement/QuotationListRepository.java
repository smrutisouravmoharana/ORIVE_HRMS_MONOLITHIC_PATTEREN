package com.orive.security.procurement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface QuotationListRepository extends JpaRepository<QuotationListEntity, Long> {
	
	List<QuotationListEntity> findByQuotationId(Long quotationId);

}
