package com.fullstackapp.backend.service;

import org.springframework.mail.SimpleMailMessage;

import com.fullstackapp.web.domain.frontend.FeedbackPojo;

public interface EmailService {

	public void sendFeedbackEmail(FeedbackPojo feedbackPojo);
	
	public void sendGenericEmailMessage(SimpleMailMessage message);
}
