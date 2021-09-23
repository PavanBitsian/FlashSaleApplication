package com.pavan.flashsale;

public class User {
	String sEmail;
	boolean bIsRegistered;
	
	public User() {
		
	}
	

	public User(String sEmail, boolean bIsRegistered) {
		super();
		this.sEmail = sEmail;
		this.bIsRegistered = bIsRegistered;
	}

	public boolean isbIsRegistered() {
		return bIsRegistered;
	}

	public void setbIsRegistered(boolean bIsRegistered) {
		this.bIsRegistered = bIsRegistered;
	}

	User(String email){
		this.sEmail = email;
	}
	
	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	

}
