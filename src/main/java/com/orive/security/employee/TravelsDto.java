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
public class TravelsDto {
	
    private Long travelId;
	private String employeeName;
	private String username;
	private LocalDate startDate;
	private LocalDate endDate;
	private String purposeOfVisit;
	private String placeOfVisit;
	private String travelMode;
	private String arrangementType;
	private double expectedTravelBudget;
	private double actualTravelBudget;
	private String description;
	private LocalDate createdDate;
}
