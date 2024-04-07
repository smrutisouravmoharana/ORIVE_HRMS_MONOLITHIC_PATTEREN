package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface ComplaintsRepository extends JpaRepository<ComplaintsEntity, Long> {

	List<ComplaintsEntity> findByUsername(String username);
}
