package com.pavan.flashsale;

//This resource can be used post order 
//When clicked on buy button, we need to send watchname and user info

public class FlashSaleAndUser {
	String sModelName;
	String sEmail;
	boolean bIsRegistered;
	//User user;
	
	public FlashSaleAndUser() {
		
	}
	
	public FlashSaleAndUser(String sModelName, String sEmail, boolean bIsRegistered) {
		super();
		this.sModelName = sModelName;
		this.sEmail = sEmail;
		this.bIsRegistered = bIsRegistered;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public boolean isbIsRegistered() {
		return bIsRegistered;
	}

	public void setbIsRegistered(boolean bIsRegistered) {
		this.bIsRegistered = bIsRegistered;
	}

	public String getsModelName() {
		return sModelName;
	}
	public void setsModelName(String sModelName) {
		this.sModelName = sModelName;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}

}
