package com.fullstackapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.fullstackapp.backend.service.EmailService;
import com.fullstackapp.backend.service.MockEmailService;

@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/fullstackapp/.fullstackapp/application-dev.properties")
public class DevelopmentConfig {

	@Bean
	public EmailService emailService()
	{
		return new MockEmailService();
	}
	
}
