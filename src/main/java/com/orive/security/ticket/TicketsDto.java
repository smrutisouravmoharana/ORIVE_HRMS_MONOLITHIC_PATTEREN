package com.orive.security.ticket;

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
public class TicketsDto {

    private String ticketsId;	
	private String ticketsCode;
	private String subject;
	private String employeeName;
	private String username;
	private String priority;
	private String createdBy;
	private LocalDate date;
	private String projectTitle;
	private String description;
	private String status;
}
