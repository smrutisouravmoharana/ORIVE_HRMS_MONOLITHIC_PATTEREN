package com.orive.security.timesheet;

import java.time.LocalDate;
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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "leaves")
public class LeavesEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.timesheet.LeavesCustomIdGenerator")
	private String leaveId;
	
	@Column(name = "username")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String username;
	
	@Column(name = "employee_name")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "leave_type")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String leaveType;
	
	@Column(name = "start_date")
	@Convert(converter = TimesheetAesEncryptor.class)
	private LocalDate startDate;
	
	@Column(name = "end_date")
	@Convert(converter = TimesheetAesEncryptor.class)
	private LocalDate endDate;
	
	@Column(name = "leave_reason")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String leaveReason;
	
	@Column(name = "applied_on")
	@Convert(converter = TimesheetAesEncryptor.class)
	private LocalDate appliedOn;
	
	@Column(name = "approval")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String approval;	
}
