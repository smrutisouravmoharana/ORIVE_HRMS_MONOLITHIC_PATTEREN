package com.orive.security.bank;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface AddBankRepository extends JpaRepository<AddBankEntity, String>{

	@Query("SELECT d FROM AddBankEntity d WHERE d.accountNumber = :accountNumber")
	Optional<AddBankEntity> findByAccountNumber(Long accountNumber);
}
