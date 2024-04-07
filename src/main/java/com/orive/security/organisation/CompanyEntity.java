package com.orive.security.organisation;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;



import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "company")
public class CompanyEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long companyId;

	@Column(name = "company_name")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String companyName;
	
	@Column(name = "company_type")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String companyType;
	
	@Column(name = "legal_or_trading_name")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String legalOrTradingName;
	
	@Column(name = "address")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String address;
	
	@Column(name = "registration_number")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String registrationNumber;
	
	@Column(name = "contact_number")
	@Convert(converter = OrganisationAesEncryptor.class)
	private Long contactNumber;
	
	@Column(name = "email")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String email;
	
	@Column(name = "website")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String website;
	
	@Column(name = "city")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String city;
	
	@Column(name = "state")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String state;
	
	@Column(name = "zip_code")
	@Convert(converter = OrganisationAesEncryptor.class)
	private int zipCode;
	
	@Column(name = "country")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String country;
	
	@Column(name = "cin")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String cin;
	
	@Column(name = "gst")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String gst;
	
	@Column(name = "uan")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String uan;
	
	@Column(name = "created_date")
	@Convert(converter = OrganisationAesEncryptor.class)
	private LocalDate createdDate;
	
	@Lob
	@Column(name = "file",length = 100000)
	private byte[] file;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
	
//	@Transient
//	private List<LocationEntity> locationEntities=new ArrayList<>();
}
