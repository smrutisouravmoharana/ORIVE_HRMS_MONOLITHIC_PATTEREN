package com.orive.security.procurement;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name = "request")
public class RequestEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long requestId;
	
	@Column(name = "requesting_person")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String requestingPerson;
	
	@Column(name = "requesting_department")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String requestingDepartment;	
	
	@Column(name = "expected_time_to_have_the_good_starts")
	@Convert(converter = ProcurementAesEncryptor.class)
	private LocalDate expectedTimeToHaveTheGoodStarts;
	
	@Column(name = "expected_time_to_have_the_good_ends")
	@Convert(converter = ProcurementAesEncryptor.class)
	private LocalDate expectedTimeToHaveTheGoodEnds;
	
	@Column(name = "reason_for_requesting")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String reasonForRequesting;
	
	@Column(name = "created_date")
	@Convert(converter = ProcurementAesEncryptor.class)
	private LocalDate createdDate;
	
	@Column(name = "status")
	private String status;
	
//	@Enumerated(EnumType.STRING)
//	@Column(name = "status")
//	private Status status;
	
	@OneToMany(targetEntity = DescriptionOfMaterialListEntity.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "request_description_fk",referencedColumnName = "requestId")
	private List<DescriptionOfMaterialListEntity> descriptionOfMaterialEntities;
}
