package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienceJoiningLetterRepository extends JpaRepository<ExperienceJoiningLetterEntity, Long> {

	List<ExperienceJoiningLetterEntity> findByUsername(String username);
}
