package com.orive.security.account;

import java.time.LocalDate;

import java.util.List;


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
public class DebitVoucherDto {

    private Long debitVoucherId;
	private String voucherType;
	private String creditAccountHead;
	private LocalDate date;
	private String remark;
	private List<DebitVoucherTableDto> debitVoucherTableEntities;
	private double total;
}
