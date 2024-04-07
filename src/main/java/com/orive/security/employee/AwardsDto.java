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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AwardsDto {

	private Long awardId;
	private String username;
	private String awardName;
	private String awardDescription;
	private String giftItem;
	private LocalDate date;
	private String email;
	private String employeeName;
	private String awardBy;
}
