package com.orive.security.website;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OriveWebsiteConfiguration {
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		
	}

}
