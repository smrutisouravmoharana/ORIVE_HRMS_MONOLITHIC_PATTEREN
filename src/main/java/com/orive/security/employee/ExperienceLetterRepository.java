package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface ExperienceLetterRepository extends JpaRepository<ExperienceLetterEntity, Long>{

	List<ExperienceLetterEntity> findByUsername(String username);
}
