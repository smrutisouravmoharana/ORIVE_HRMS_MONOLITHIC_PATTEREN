package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PromotionsRepository extends JpaRepository<PromotionsEntity, Long> {

	List<PromotionsEntity> findByUsername(String username);
}
