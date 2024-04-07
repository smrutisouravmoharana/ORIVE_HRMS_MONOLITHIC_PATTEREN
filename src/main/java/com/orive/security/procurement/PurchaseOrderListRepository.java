package com.orive.security.procurement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PurchaseOrderListRepository extends JpaRepository<PurchaseOrderListEntity, Long>{

	List<PurchaseOrderListEntity> findByPurchaseOrderId(Long purchaseOrderId);
}
