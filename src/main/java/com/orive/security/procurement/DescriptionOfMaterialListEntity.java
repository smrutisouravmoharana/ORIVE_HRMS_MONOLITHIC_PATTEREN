package com.orive.security.procurement;

import org.hibernate.annotations.GenericGenerator;



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
@Table(name = "descriptionofmterial")
public class DescriptionOfMaterialListEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long descriptionOfMaterialId;
	
	@Column(name = "description_of_material_or_goods_or_Service")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String descriptionOfMaterialOrGoodsOrService;
	
	@Column(name = "unit_name")
	@Convert(converter = ProcurementAesEncryptor.class)
	private String unitName;
	
	@Column(name = "quantity")
	@Convert(converter = ProcurementAesEncryptor.class)
	private double quantity;
}
