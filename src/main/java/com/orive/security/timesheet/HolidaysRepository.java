package com.orive.security.timesheet;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface HolidaysRepository extends JpaRepository<HolidaysEntity, String>{
	
	@Query("SELECT h FROM HolidaysEntity h WHERE h.eventName = :eventName")
	Optional<HolidaysEntity> findByEventName(String eventName);

}
