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
public class TerminationsDto {
	
    private Long terminationId;
	private String employeeName;
	private String username;
	private String email;
	private LocalDate terminateDate;
	private String reasonForTermination;
	private String terminatedBy;
}
