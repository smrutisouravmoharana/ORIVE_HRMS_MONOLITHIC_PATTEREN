package com.orive.security.account;



import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "credit_voucher_table" )
public class CreditVoucherTableEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long creditVoucherTableId;
	
	@Column(name = "account_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String accountName;
	
	@Column(name = "sub_type")
	@Convert(converter = AccountAesEncryptor.class)
	private String subType;
	
	@Column(name = "ledger_comment")
	@Convert(converter = AccountAesEncryptor.class)
	private String ledgerComment;
	
	@Column(name = "amount")
	@Convert(converter = AccountAesEncryptor.class)
	private double amount;
}
