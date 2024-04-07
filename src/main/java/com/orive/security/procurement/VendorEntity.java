package com.orive.security.procurement;



import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "vendor")
public class VendorEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vendorId;
	
	@Column(name = "vendor_name")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String vendorName;
	
	@Column(name = "mobile_no")
	@Convert(converter = ProcurementAesEncryptor.class)
	private Long mobileNo;
	
	@Column(name = "email_address")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String emailAddress;
	
	@Column(name = "address")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String address;
	
	@Column(name = "country")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String country;
	
	@Column(name = "city")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String city;
	
	@Column(name = "zip_code")
	@Convert(converter = ProcurementAesEncryptor.class)
	private int zipCode;
	
	@Column(name = "previous_balance")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double previousBalance;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
}
