package com.fullstackapp.web.domain.frontend;

import java.io.Serializable;

public class FeedbackPojo implements Serializable {
	
	private static long serialVersionUId=1L;
	
	private String email;
	private String firstName;

	private String lastName;
	private String feedback;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FrontendPojo [email=");
		builder.append(email);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", feedback=");
		builder.append(feedback);
		builder.append("]");
		return builder.toString();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fName) {
		this.firstName = fName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	

}
