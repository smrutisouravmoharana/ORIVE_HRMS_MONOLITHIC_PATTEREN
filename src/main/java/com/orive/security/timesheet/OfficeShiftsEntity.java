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
@Table(name = "officeshift")
public class OfficeShiftsEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.timesheet.OfficeShiftsCustomIdGenerator")
	private String officeShiftsId;
	
	@Column(name = "created_date")
	@Convert(converter = TimesheetAesEncryptor.class)
	private LocalDate createdDate;
	
	@Column(name = "day")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String day;
	
	@Column(name = "office_clock_in")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String officeClockIn;
	
	@Column(name = "office_clock_out")
	@Convert(converter = TimesheetAesEncryptor.class)
	private String officeClockOut;
}