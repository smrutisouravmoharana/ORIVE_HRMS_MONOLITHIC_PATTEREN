package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface EmployeesExitRepository extends JpaRepository<EmployeesExitEntity, Long> {

	List<EmployeesExitEntity> findByUsername(String username);
}