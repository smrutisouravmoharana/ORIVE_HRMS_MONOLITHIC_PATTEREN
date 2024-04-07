package com.orive.security.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface InternJoiningLetterRepository extends JpaRepository<InternJoiningLetterEntity, Long> {

	List<InternJoiningLetterEntity> findByUsername(String username);
}
