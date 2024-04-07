package com.orive.security.account;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AccountBalanceRepository extends JpaRepository<AccountBalancesEntity, Long> {

}
