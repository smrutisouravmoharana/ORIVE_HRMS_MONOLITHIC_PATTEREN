package com.orive.security.account;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountsConfiguration {
	
	@Bean
	
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
