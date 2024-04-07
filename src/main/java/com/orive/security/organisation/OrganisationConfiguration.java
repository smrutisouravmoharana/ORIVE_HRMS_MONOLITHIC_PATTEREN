package com.orive.security.organisation;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class OrganisationConfiguration {

	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
