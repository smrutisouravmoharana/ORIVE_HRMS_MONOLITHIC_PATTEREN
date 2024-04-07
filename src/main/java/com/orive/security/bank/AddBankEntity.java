package com.orive.security.bank;

import org.hibernate.annotations.GenericGenerator;


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
@Table(name = "addbankentity")
public class AddBankEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.bank.CustomIdGenerator")
    private String addBankId;
	
	@Column(name = "bank_name")
	@Convert(converter = BankAesEncryptor.class)
	private String bankName;
	
	@Column(name = "account_name")
	@Convert(converter = BankAesEncryptor.class)
	private String accountName;
	
	@Column(name = "account_number")
	@Convert(converter = BankAesEncryptor.class)
	private Long accountNumber;
	
//	@Column(name = "phone_number")
//	@Convert(converter = BankAesEncryptor.class)
//	private String phoneNumber;
	
	@Column(name = "branch_name")
	@Convert(converter = BankAesEncryptor.class)
	private String branchName;
	
	@Column(name = "account_type")
	//@Convert(converter = BankAesEncryptor.class)
	private String accountType;
		
	@Column(name="status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name="status")
//	private Status status;
	
}
