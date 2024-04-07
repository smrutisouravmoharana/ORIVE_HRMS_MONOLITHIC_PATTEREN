package com.orive.security.procurement;

import org.hibernate.annotations.GenericGenerator;



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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "companylist")
public class CompanyListEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyListId;
	
	//@Convert(converter = AesEncryptor.class)
	private Long bidAnalysisId;
	
	@Column(name = "company")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String company;
	
	@Column(name = "description")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String description;
	
	@Column(name = "reason_of_choosing")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String reasonOfChoosing;
	
	@Column(name = "remarks")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String remarks;
	
	@Column(name = "unit_name")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String unitName;
	
	@Column(name = "quantity")
	@Convert(converter = ProcurementAesEncryptor.class)
	private int quantity;
	
	@Column(name = "price")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double price;
	
	@Column(name = "total")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double total;
	
	@Column(name = "grand_total")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double grandTotal;
}
