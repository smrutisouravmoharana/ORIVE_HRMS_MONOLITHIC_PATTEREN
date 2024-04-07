package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface WarningsRepository extends JpaRepository<WarningsEntity, Long> {

	List<WarningsEntity> findByUsername(String username);
}
