package com.orive.security.procurement;


import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "purchaseOrder_list")
public class PurchaseOrderListEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long purchaseOrderListId;
	
	//@Convert(converter = AesEncryptor.class)
	private Long purchaseOrderId;
	
	@Column(name = "description")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String description;
	
	@Column(name = "unit_name")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String unitName;
	
	@Column(name = "quantity")
	@Convert(converter = ProcurementAesEncryptor.class)
	private int quantity;
	
	@Column(name = "price")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double price;
	
	
}
