package com.orive.security.organisation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ExpenseListRepository extends JpaRepository<ExpenseListEntity, Long>{

	List<ExpenseListEntity> findByexpenceId(Long expenceId);
}
