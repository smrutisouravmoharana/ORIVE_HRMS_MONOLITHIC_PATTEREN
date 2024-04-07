package com.orive.security.timesheet;

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
public class LeaveDto {

    private String leaveId;
	private String username;
	private String employeeName;
	private String leaveType;
	private LocalDate startDate;
	private LocalDate endDate;
	private String leaveReason;
	private LocalDate appliedOn;
	private String approval;	
}
