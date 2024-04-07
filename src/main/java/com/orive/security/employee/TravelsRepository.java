package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface TravelsRepository extends JpaRepository<TravelsEntity, Long>{

	List<TravelsEntity> findByUsername(String username);
}
