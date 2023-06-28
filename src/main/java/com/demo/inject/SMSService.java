package com.demo.inject;

public class SMSService implements Service{
	@Override
	public boolean send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("from SMS Send");
		return true;
	}
}
