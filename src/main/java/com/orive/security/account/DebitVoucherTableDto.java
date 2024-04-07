package com.orive.security.account;

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
public class DebitVoucherTableDto {

    private Long debitVoucherTableId;
	private String accountName;
	private String subType;
	private String ledgerComment;
	private double amount;
}
