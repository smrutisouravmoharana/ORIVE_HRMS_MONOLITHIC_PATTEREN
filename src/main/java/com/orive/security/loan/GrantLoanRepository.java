package com.orive.security.loan;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface GrantLoanRepository extends JpaRepository<GrantLoanEntity, String> {

	List<GrantLoanEntity> findByUsername(String username);
}
