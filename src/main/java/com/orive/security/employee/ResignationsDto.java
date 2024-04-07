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
public class ResignationsDto {
	
    private Long resignationId;
	private String employeeName;
	private String username;
	private LocalDate noticeDate;
	private LocalDate resignationDate;
	private String resignationReason;
}
