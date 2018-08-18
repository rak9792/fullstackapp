package com.fullstackapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.fullstackapp.backend.service.EmailService;
import com.fullstackapp.backend.service.SmtpEmailService;

@Configuration
@Profile("prod")
@PropertySource("file:///${user.home}/fullstackapp/.fullstackapp/application-prod.properties")
public class ProductionConfig {

	@Bean
	public EmailService emailService()
	{
		return new SmtpEmailService();
	}
}
