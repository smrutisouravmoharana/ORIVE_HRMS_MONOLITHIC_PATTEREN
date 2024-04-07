package com.orive.security.payroll;

import java.time.LocalDate;
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
public class AdvanceSaleryDto {

	private String advanceSaleryId;
	private LocalDate createdDate;
	private String employeeName;
	private double salary;
	private double advanceAmount;
	private double salaryDue;
	private LocalDate monthAndYear;
}
