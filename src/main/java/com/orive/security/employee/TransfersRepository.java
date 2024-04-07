package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface TransfersRepository extends JpaRepository<TransfersEntity, Long>{

	List<TransfersEntity> findByUsername(String username);
}
