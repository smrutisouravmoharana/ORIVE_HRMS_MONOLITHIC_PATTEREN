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
@Table(name = "promotions")
public class PromotionsEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long promotionsId;
	
	@Column(name = "employee_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String employeeName;
	
	
	@Column(name = "username")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String username;
	
	
	@Column(name = "email")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String email;
	

	@Column(name = "promotion_title")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String promotionTitle;
	
	@Column(name = "salary_hike")
	@Convert(converter = EmployeeAesEncryptor.class)
	private Integer salaryHike;
	
	@Column(name = "promotion_date")
	@Convert(converter = EmployeeAesEncryptor.class)
	private LocalDate promotionDate;
	
	@Column(name = "hr_name")
	@Convert(converter = EmployeeAesEncryptor.class)
	private String hrName;
	
	@Column(name = "description",length = 3000)
	@Convert(converter = EmployeeAesEncryptor.class)
	private String description;

}
