package com.orive.security.employee;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
@Table(name = "employees")
public class EmployeesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	//@Column(name = "employee_id", unique = true)
	//@Convert(converter = EmployeeAesEncryptor.class)
	private Long employeeId;
	
	@Column(name = "employee_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "username")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String username;
	
	@Column(name = "designation_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String designationName;
	
	@Column(name = "email")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String email;
	
	@Column(name = "phone")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Long phone;
	
	@Column(name = "alternative_phone")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Long alternativePhone;
	
	@Column(name = "country")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String country;
	
	@Column(name = "city")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String city;
	
	@Column(name = "zip_code")
	@Convert(converter = EmployeeAesEncryptor.class)
	private int zipCode;
	
	@Column(name = "employee_role")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String employeeRole;
	
	@Column(name = "company_type")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String companyType;
	
	@Column(name = "attendance_time")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String attendanceTime;
	
	@Column(name = "employee_type")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String employeeType;
	
	@Column(name = "created_date")
	@Convert(converter = EmployeeAesEncryptor.class)
	private LocalDate createdDate;
		
	@Column(name = "account_number")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Long accountNumber;
	
	@Column(name = "bank_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String bankName;
	
	@Column(name = "ifsc_number")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String ifscNumber;
	
	@Column(name = "branch_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String branchName;
	
	@Column(name = "basic_salary")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double basicSalary;
	
	@Column(name = "transport_allowance")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double transportAllowance;
	
	@Column(name = "gross_salary")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double grossSalary;
	
	@Column(name = "department_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String departmentName;
	
	@Column(name = "tin_number")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Long tinNumber;
	
	@Column(name = "hra_allowances")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double hraAllowances;
	
	@Column(name = "other_allowances")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double otherAllowances;
	
	@Column(name = "pf_allowances")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double pfAllowances;
	
	@Column(name = "da_allowances")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double daAllowances;
	
	@Column(name = "medical_allowances")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double medicalAllowances;
	
	@Column(name = "other_insurance")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double otherInsurance;
	
	@Column(name = "tax")
	@Convert(converter = EmployeeAesEncryptor.class)
	private double tax;
	
	@Column(name = "sub_department")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String subDepartment;
	
	@Column(name = "position")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String position;
	
	@Column(name = "duty_type")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String dutyType;
	
	@Column(name = "hire_date")
	@Convert(converter = EmployeeAesEncryptor.class)
	private LocalDate hireDate;
	
	@Column(name = "joining_date")
	@Convert(converter = EmployeeAesEncryptor.class)
	private LocalDate joiningDate;
	
	@Column(name = "rate_type")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String rateType;
	
	@Column(name = "rate_number")
	@Convert(converter = EmployeeAesEncryptor.class)
	private int rateNumber;
	
	@Column(name = "monthly_work_hours")
	@Convert(converter = EmployeeAesEncryptor.class)
	private int monthlyWorkHours;
	
	@Column(name = "pay_frequency")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String payFrequency;
	
	@Column(name = "medical")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String medical;
	
	@Column(name = "family")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String family;
	
	@Column(name = "transportation")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String transportation;
	
	@Column(name = "others")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String others;
	
	@Column(name = "team_leader_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String teamLeaderName;
	
	@Column(name = "reporting_to")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String reportingTo;
	
	@Column(name = "date_of_birth")
	@Convert(converter = EmployeeAesEncryptor.class)
	private LocalDate dateOfBirth;
	
	@Column(name = "gender")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String gender;
	
	@Column(name = "marital_status")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String maritalStatus;
	
	@Column(name = "work_in_city")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String workInCity;
	
	@Column(name = "city_of_residence")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String cityOfResidence;
	
	@Column(name = "work_permit")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String workPermit;
	
	@Lob
	@Column(name = "upload_photo", length = 100000)
	private byte[] uploadPhoto;
	
	@Column(name = "business_email")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String businessEmail;
	
	@Column(name = "home_phone")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Long homePhone;
	
	@Column(name = "cell_phone")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Long cellPhone;
	
	@Column(name = "user_email_or_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String userEmailOrName;
	
	@Column(name = "password")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String password;
	
	@Lob
	@Column(name = "upload_document", length = 100000)
	private byte[] uploadDocument;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
}
