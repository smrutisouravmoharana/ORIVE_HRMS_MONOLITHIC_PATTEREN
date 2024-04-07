package com.orive.security.account;



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
@Table(name = "account_list")
public class AccountListEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountListId;	
	
	@Column(name = "employee_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "username")
	@Convert(converter = AccountAesEncryptor.class)
	private String username;
	
	@Column(name = "department_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String departmentName;
	
	@Column(name = "position")
	@Convert(converter = AccountAesEncryptor.class)
	private String position;
	
	@Column(name = "bank_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String bankName;
	
	@Column(name = "account_holder_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String accountHolderName;
	
	@Column(name = "account_number")
	@Convert(converter = AccountAesEncryptor.class)
	private Long accountNumber;
	
	@Column(name = "routing_number")
	@Convert(converter = AccountAesEncryptor.class)
	private Long routingNumber;
	
	@Column(name = "account_type")
	@Convert(converter = AccountAesEncryptor.class)
	private String accountType;
	
	@Column(name = "email_address")
	@Convert(converter = AccountAesEncryptor.class)
	private String emailAddress;
	
	@Column(name = "email_system")
	@Convert(converter = AccountAesEncryptor.class)
	private String emailSystem;
	
	@Column(name = "user_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String userName;
	
	@Column(name = "password")
	@Convert(converter = AccountAesEncryptor.class)
	private String password;
	
	@Column(name = "access_level")
	@Convert(converter = AccountAesEncryptor.class)
	private String accessLevel;
	
	@Column(name = "additional_account_type")
	@Convert(converter = AccountAesEncryptor.class)
	private String additionalAccountType;
	
	@Column(name = "additional_account_information")
	@Convert(converter = AccountAesEncryptor.class)
	private String additionalAccountInformation;
	
	@Column(name = "comments")
	@Convert(converter = AccountAesEncryptor.class)
	private String comments;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
}
