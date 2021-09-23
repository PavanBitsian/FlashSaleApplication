package com.pavan.flashsale;

import java.util.ArrayList;

public class FlashSale {
	String sModelName;
	int iNumberOfWatches;
	int iAvailableNumberOfWatches;
	
	public FlashSale() {
		// TODO Auto-generated constructor stub
	}

	public FlashSale(String sModelName, int iNumberOfWatches,int iAvailableNumberOfWatches) {
		super();
		this.sModelName = sModelName;
		this.iNumberOfWatches = iNumberOfWatches;
		this.iAvailableNumberOfWatches = iAvailableNumberOfWatches;
	}

	public String getsModelName() {
		return sModelName;
	}

	public void setsModelName(String sModelName) {
		this.sModelName = sModelName;
	}

	public int getiNumberOfWatches() {
		return iNumberOfWatches;
	}

	public void setiNumberOfWatches(int iNumberOfWatches) {
		this.iNumberOfWatches = iNumberOfWatches;
	}
	
	
	
	public int getiAvailableNumberOfWatches() {
		return iAvailableNumberOfWatches;
	}

	public void setiAvailableNumberOfWatches(int iAvailableNumberOfWatches) {
		this.iAvailableNumberOfWatches = iAvailableNumberOfWatches;
	}

	
	public static ArrayList<FlashSale> getListOfWatches() {
//		ArrayList<String> ar=new ArrayList<String>();
//		if(getiAvailableNumberOfWatches()>0) {
//			ar.add(this.sModelName);
//		}
		ArrayList<FlashSale> ar=new ArrayList<FlashSale>();
		FlashSale fs1 = new FlashSale("Casio GShock",1000,1000);
		FlashSale fs2 = new FlashSale("Casio FShock",2000,2000);
		ar.add(fs1);
		ar.add(fs2);
		return ar;
	}

}
