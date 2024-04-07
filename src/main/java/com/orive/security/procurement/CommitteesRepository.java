package com.orive.security.procurement;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CommitteesRepository extends JpaRepository<CommitteesEntity, Long> {
	
	//find by Name method
	Optional<CommitteesEntity> findByName(String name);

}
