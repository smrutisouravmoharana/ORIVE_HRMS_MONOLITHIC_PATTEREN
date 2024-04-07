package com.orive.security.loan;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

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
@Table(name = "grantloan")
public class GrantLoanEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.loan.GrantLoanCustomIdGenerator")
	private String grantLoanId;
	
	@Column(name = "employee_name")
	@Convert(converter = LoanAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "username")
	@Convert(converter = LoanAesEncryptor.class)
	private String username;
	
	@Column(name = "permitted_by")
	@Convert(converter = LoanAesEncryptor.class)
	private String permittedBy;
	
	@Column(name = "loan_details")
	@Convert(converter = LoanAesEncryptor.class)
	private String loanDetails;
	
	@Column(name = "approve_date")
	@Convert(converter = LoanAesEncryptor.class)
	private LocalDate approveDate;
	
	@Column(name = "repayment_form")
	@Convert(converter = LoanAesEncryptor.class)
	private LocalDate repaymentForm;
	
	@Column(name = "amount")
	@Convert(converter = LoanAesEncryptor.class)
	private double amount;
	
	@Column(name = "interest_persentage")
	@Convert(converter = LoanAesEncryptor.class)
	private double interestPersentage;
	
	@Column(name = "installment_period")
	@Convert(converter = LoanAesEncryptor.class)
	private double installmentPeriod;
	
	@Column(name = "repayment_total")
	@Convert(converter = LoanAesEncryptor.class)
	private double repaymentTotal;
	
	@Column(name = "installment")
	@Convert(converter = LoanAesEncryptor.class)
	private double installment;
	
	@Column(name = "account_type")
	@Convert(converter = LoanAesEncryptor.class)
	private String accountType;
	
	@Column(name = "installment_cleared")
	@Convert(converter = LoanAesEncryptor.class)
	private int installmentCleared;
	
	@Column(name = "total_payment_cleared")
	@Convert(converter = LoanAesEncryptor.class)
	private double totalPaymentCleared;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
}
