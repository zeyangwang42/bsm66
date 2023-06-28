package com.demo.inject;

public class EmailService implements Service{

	@Override
	public boolean send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sending Eamil");
		return true;
	}

}
