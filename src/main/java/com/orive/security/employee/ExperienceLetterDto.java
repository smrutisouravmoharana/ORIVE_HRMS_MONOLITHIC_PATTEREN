package com.orive.security.employee;

import java.time.LocalDate;
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
public class ExperienceLetterDto {
	
    private Long experienceLetterId;
	private LocalDate formReleaseDate;
	private String referrenceNumber;
	private LocalDate date;
	private String employeeName;
	private String username;
	private String designation;
	private String workBasedOn;
	private LocalDate joiningDate;
	private LocalDate leavesDate;
	private String  servingPeriod;
}
