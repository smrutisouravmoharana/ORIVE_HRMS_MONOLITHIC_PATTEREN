package com.orive.security.account;



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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "journal_voucher_table")
public class JournalVoucherTableEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long journalVoucherTableId;
	
	@Column(name = "account_name")
	@Convert(converter = AccountAesEncryptor.class)
	private String accountName;
	
	@Column(name = "sub_type")
	@Convert(converter = AccountAesEncryptor.class)
	private String subType;
	
	@Column(name = "ledger_comment")
	@Convert(converter = AccountAesEncryptor.class)
	private String ledgerComment;
	
	@Column(name = "debit")
	@Convert(converter = AccountAesEncryptor.class)
	private double debit;
	
	@Column(name = "credit")
	@Convert(converter = AccountAesEncryptor.class)
	private double credit;
	
	@Column(name = "reverse_account_head")
	@Convert(converter = AccountAesEncryptor.class)
	private String reverseAccountHead;
}