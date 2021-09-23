package com.pavan.flashsale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FlashSaleService {
	private List <FlashSale> flashSaleData = new ArrayList<>(Arrays.asList(new FlashSale("Casio GShock",1000,1000),new FlashSale("Casio FShock",2000,2000)));
	
	public List<FlashSale> getFlashSaleData(){
		return flashSaleData;
	}
	
	public FlashSale getWatchData(String name) {
		return flashSaleData.stream().filter(t->t.getsModelName().equals(name)).findFirst().get();
	}
}
