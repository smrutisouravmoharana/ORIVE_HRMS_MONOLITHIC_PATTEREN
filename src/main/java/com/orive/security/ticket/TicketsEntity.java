package com.orive.security.ticket;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
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
@Table(name = "tickets")
public class TicketsEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.ticket.CustomIdGenerator")
	private String ticketsId;
	
	@Column(name = "tickets_code")
	@Convert(converter = TicketAesEncryptor.class)
	private String ticketsCode;
	
	@Column(name = "subject")
	@Convert(converter = TicketAesEncryptor.class)
	private String subject;
	
	@Column(name = "employee_name")
	@Convert(converter = TicketAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "username")
	@Convert(converter = TicketAesEncryptor.class)
	private String username;
	
	@Column(name = "priority")
	@Convert(converter = TicketAesEncryptor.class)
	private String priority;
	
	@Column(name = "created_by")
	@Convert(converter = TicketAesEncryptor.class)
	private String createdBy;
	
	@Column(name = "date")
	@Convert(converter = TicketAesEncryptor.class)
	private LocalDate date;
	
	@Column(name = "project_title")
	@Convert(converter = TicketAesEncryptor.class)
	private String projectTitle;
	
	@Column(name = "description")
	@Convert(converter = TicketAesEncryptor.class)
	private String description;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
}
