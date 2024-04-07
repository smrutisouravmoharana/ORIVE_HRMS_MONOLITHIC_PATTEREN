package com.orive.security.procurement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;




public interface GoodReceivedListRepository extends JpaRepository<GoodReceivedListEntity, Long>{

	List<GoodReceivedListEntity> findByGoodReceivedId(Long goodReceivedId);
}
