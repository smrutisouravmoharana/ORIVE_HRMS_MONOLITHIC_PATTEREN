package com.orive.security.employee;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees_exit")
public class EmployeesExitEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long employeeExitId;
	
	@Column(name = "employee_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "username")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String username;
	
	@Column(name = "exit_date")
	@Convert(converter = EmployeeAesEncryptor.class)
	private LocalDate exitDate;
	
	@Column(name = "type_of_exit")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String typeOfExit;
	
	@Column(name = "exit_interview")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String exitInterview;
	
	@Column(name = "inactivate_employee_account")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String inactivateEmployeeAccount;
	
	@Column(name = "description")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String description;
}