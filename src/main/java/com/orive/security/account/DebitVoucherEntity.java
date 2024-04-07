package com.orive.security.account;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "debit_voucher")
public class DebitVoucherEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long debitVoucherId;
	
	@Column(name = "voucher_type")
	@Convert(converter = AccountAesEncryptor.class)
	private String voucherType;
	
	@Column(name = "credit_account_head")
	@Convert(converter = AccountAesEncryptor.class)
	private String creditAccountHead;
	
	@Column(name = "date")
	@Convert(converter = AccountAesEncryptor.class)
	private LocalDate date;
	
	@Column(name = "remark")
	@Convert(converter = AccountAesEncryptor.class)
	private String remark;
	
	@OneToMany(targetEntity = DebitVoucherTableEntity.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "debitvoucher_table_fk",referencedColumnName = "debitVoucherId")
	private List<DebitVoucherTableEntity> debitVoucherTableEntities;
	
	@Column(name = "total")
	@Convert(converter = AccountAesEncryptor.class)
	private double total;
}
