package com.pavan.flashsale;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//When clicked on buy button, we need to send watchname and user info
//This class is not used
@RestController
public class FlashSaleController {
	
	//List <FlashSale> flashSaleData = FlashSale.getListOfWatches();//new ArrayList<>(Arrays.asList(new FlashSale("Casio GShock",1000),new FlashSale("Casio FShock",2000)));
	@Autowired
	FlashSaleService flashSaleService;
	
	@RequestMapping("/FlashSale")
	public List<FlashSale> flashSaleData() throws OutofSaleException {
		
		
//		ArrayList<FlashSale> ar=new ArrayList<FlashSale>();
//		FlashSale fs1 = new FlashSale("Casio GShock",1000);
//		FlashSale fs2 = new FlashSale("Casio FShock",2000);
//		ar.add(fs1);
//		ar.add(fs2);
		return flashSaleService.getFlashSaleData();
		
//		if(user.isbIsRegistered()) {
//			int iSize = FlashSale.getListOfWatches().size();
//			for(int i=0;i<iSize;++i) {
//				FlashSale fs1 = FlashSale.getListOfWatches().get(0);//new FlashSale("Casio GShock",1000);
//				if(sWatchName.equals(fs1.getsModelName()) && fs1.getiAvailableNumberOfWatches()>0) {
//					fs1.setiAvailableNumberOfWatches(fs1.getiNumberOfWatches()-1);
//				}else if(sWatchName.equals(fs1.getsModelName()) && fs1.getiAvailableNumberOfWatches()>0) {
//					fs1.setiAvailableNumberOfWatches(fs1.getiNumberOfWatches()-1);
//				}else {
//					throw new OutofSaleException("Sorry outofstock. Please try again later");
//				}
//			}
//		}
	}
	
	@RequestMapping("/FlashSale/{name}")
	public FlashSale getWatchData(@PathVariable String name){
		
		return flashSaleService.getWatchData(name);
	}
	

}
