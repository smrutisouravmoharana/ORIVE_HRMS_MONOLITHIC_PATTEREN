package com.orive.security.payroll;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;



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
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "advance_salery")
public class AdvanceSaleryEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.payroll.AdvanceSaleryCustomIdGenerator")
	private String advanceSaleryId;
	
	@Column(name = "created_date")
	@Convert(converter = PayrollAesEncryptor.class)
	private LocalDate createdDate;
	
	@Column(name = "employee_name")
	@Convert(converter = PayrollAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "salary")
	@Convert(converter = PayrollAesEncryptor.class)
	private double salary;
	
	@Column(name = "advance_amount")
	@Convert(converter = PayrollAesEncryptor.class)
	private double advanceAmount;
	
	@Column(name = "salary_due")
	@Convert(converter = PayrollAesEncryptor.class)
	private double salaryDue;
	
	@Column(name = "month_and_year")
	@Convert(converter = PayrollAesEncryptor.class)
	private LocalDate monthAndYear;
}
