package com.orive.security.procurement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "purchaseOrder")
public class PurchaseOrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long purchaseOrderId;
	
	@Column(name = "quotation")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String quotation;
	
	@Column(name = "location")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String location;

	@Column(name = "vendor_name")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String vendorName;
	
	@Column(name = "address")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String address;
	
	@Column(name = "notes")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String notes;
	
	@Column(name = "authorized_by_name")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String authorizedByName;
	
	@Column(name = "title")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String title;
	
	@Lob
	@Column(name = "signature_and_stamp", length = 100000)
	private byte[] signatureAndStamp;
	
	@Column(name = "date")
	@Convert(converter = ProcurementAesEncryptor.class)
	private LocalDate date;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
	
	@Transient
	private List<PurchaseOrderListEntity> purchaseOrderListEntities = new ArrayList<>();
	
	@Column(name = "total")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double total;
	
	@Column(name = "grand_total")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double grandTotal;
	
//	@OneToMany(targetEntity = PurchaseOrderListEntity.class,cascade = CascadeType.ALL)
//	@JoinColumn(name = "purchaseOrder_list_fk",referencedColumnName = "purchaseOrderId")
//	private List<PurchaseOrderListEntity> purchaseOrderListEntities;
}
