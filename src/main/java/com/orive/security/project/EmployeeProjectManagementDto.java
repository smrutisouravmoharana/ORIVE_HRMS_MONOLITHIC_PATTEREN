package com.orive.security.project;


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
public class EmployeeProjectManagementDto {

	
    private Long employeeProjectManagementId;
    private String username;
	private String projectName;
	private String employeeName;
	private String taskAssignedFor;
	private String typeTheTaskHere;
   
}
