package com.orive.security.bank;



import jakarta.persistence.Column;
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
public class AddBankDto {
	
	private String addBankId;
	private String bankName;
	private String accountName;
	//private String phoneNumber;
	private Long accountNumber;
	private String branchName;
	private String accountType;
	private String status;
}
