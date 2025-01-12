package com.orive.security.organisation;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

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
@Table(name = "location")
public class LocationEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long locationId;
	
	@Column(name = "company_name")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String companyName;
	
	@Column(name = "location_head")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String locationHead;
	
	@Column(name = "location_name")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String locationName;
	
	@Column(name = "address")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String address;	
	
	@Column(name = "email")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String email;
	
	@Column(name = "phone")
	@Convert(converter = OrganisationAesEncryptor.class)
	private Long phone;
	
	@Column(name = "fax_number")
	@Convert(converter = OrganisationAesEncryptor.class)
	private String faxNumber;
	
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
	
	@Column(name = "date")
	@Convert(converter = OrganisationAesEncryptor.class)
	private LocalDate date;
	
	@Column(name = "status")
	private String status;
//	
//	@Column(name = "approved_by")
//	private String approvedBy;
}
