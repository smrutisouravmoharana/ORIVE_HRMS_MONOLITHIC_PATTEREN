package com.orive.security.procurement;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface GoodReceivedRepository extends JpaRepository<GoodReceivedEntity, Long> {
	
	//find by companyName method
	Optional<GoodReceivedEntity> findByVendorName(String vendorName);

}
