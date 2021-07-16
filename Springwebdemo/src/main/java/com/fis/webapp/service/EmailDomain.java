package com.fis.webapp.service;

import org.springframework.stereotype.Component;

@Component
public class EmailDomain {
	
	public String domainOfEmail(String email) {
		//System.out.println("EmailDomain"+email);
		String domainName = "";
		String[] parts = email.split("[@.]");
		domainName = parts[1];
		return domainName;

	}
}
