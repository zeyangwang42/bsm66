package com.demo.inject;

public class ApiService {
	private EmailService emailService;
	private SMSService smsService;
	
	public ApiService() {
		super();
	}
	public ApiService(EmailService es,SMSService ss) {
		super();
		this.emailService=es;
		this.smsService=ss;
	}
	
	public boolean sendSMS(String msg) {
		return this.smsService.send(msg);
		
	}
	
	public boolean sendEmail(String msg) {
		
		return this.emailService.send(msg);
		
	}
	
	
	
}
