package com.orive.security.project;




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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employeeprojectmanagement")
public class EmployeeProjectManagementEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom-sequence")
//    @GenericGenerator(name = "custom-sequence", strategy = "com.orive.security.project.EmployeeProjectManagementCustomIdGenerator")
	private Long employeeProjectManagementId;
	
	@Column(name = "username")
	@Convert(converter = ProjectAesEncryptor.class)
	private String username;
	
	@Column(name = "project_name")
	@Convert(converter = ProjectAesEncryptor.class)
	private String projectName;
	
	@Column(name = "employee_name")
	@Convert(converter = ProjectAesEncryptor.class)
	private String employeeName;
	
	@Column(name = "task_assigned_for")
	@Convert(converter = ProjectAesEncryptor.class)
	private String taskAssignedFor;
	
	@Column(name = "type_the_task_here")
	@Convert(converter = ProjectAesEncryptor.class)
	private String typeTheTaskHere;
}
