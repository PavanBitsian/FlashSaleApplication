package com.pavan.flashsale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlashSaleAndUserController {
	@Autowired
	FlashSaleService flashSaleService;
	
//	String sModelName = "Casio GShock";
//	User u = new User("pavan29275@gmail.com");//assumption made that enter email id is  always valid, so no validation performed
	
	@RequestMapping(method=RequestMethod.POST,value="/Buy")
	public String flashSaleData(@RequestBody FlashSaleAndUser flashSaleAndUser) throws OutofSaleException {
		User user = new User(flashSaleAndUser.getsEmail(),flashSaleAndUser.bIsRegistered);
		String sWatchName = flashSaleAndUser.getsModelName();
		System.out.println("sWatchName:"+sWatchName);
		if(user.isbIsRegistered()) {
			int iSize = FlashSale.getListOfWatches().size();
			for(int i=0;i<iSize;++i) {
				FlashSale fs1 = flashSaleService.getFlashSaleData().get(i);//new FlashSale("Casio GShock",1000);
				System.out.println("numofWatches"+fs1.getiAvailableNumberOfWatches());
				if(sWatchName.equals(fs1.getsModelName()) && fs1.getiAvailableNumberOfWatches()>0) {
					fs1.setiAvailableNumberOfWatches(fs1.getiNumberOfWatches()-1);
					return "item added to cart. Please pay in 15 min to confirm the order";
				}
			}
		}
		return "Sorry outofstock. Please try again later";
	}
	
}
