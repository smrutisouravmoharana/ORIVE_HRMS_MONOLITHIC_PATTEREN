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
@Table(name = "account_balances")
public class AccountBalancesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountBalancesId;
	
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
	
	@Column(name = "hsa_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private double hsaBalance;
	
	@Column(name = "fsa_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private double fsaBalance;
	
	@Column(name = "retirement_account_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private double retirementAccountBalance;
	
	@Column(name = "other_benefits_accounts_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private double otherBenefitsAccountsBalance;
	
	@Column(name = "expense_reimbursement_account_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private double expenseReimbursementAccountBalance;
	
	@Column(name = "details")
	@Convert(converter = AccountAesEncryptor.class)
	private String details;
	
	@Column(name = "vacation_days_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private int vacationDaysBalance;
	
	@Column(name = "sick_days_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private int sickDaysBalance;
	
	@Column(name = "personal_days_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private int personalDaysBalance;
	
	@Column(name = "floating_holidays_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private int floatingHolidaysBalance;
	
	@Column(name = "account_type")
	@Convert(converter = AccountAesEncryptor.class)
	private String accountType;
	
	@Column(name = "account_balance")
	@Convert(converter = AccountAesEncryptor.class)
	private double accountBalance;
	
	@Column(name = "purpose")
	@Convert(converter = AccountAesEncryptor.class)
	private String purpose;
	
	@Column(name = "comments")
	@Convert(converter = AccountAesEncryptor.class)
	private String comments;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
}
