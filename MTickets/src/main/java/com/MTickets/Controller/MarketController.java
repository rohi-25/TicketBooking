package com.MTickets.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MTickets.Entity.Market;
import com.MTickets.Service.MarketService;

@RestController
public class MarketController {
	MarketService serobj;
	
	@GetMapping("/fetchMarketByProductnamePrefix/{prefix}")
	public List<Market>fetchMarketByProductnamePrefix(@PathVariable String prefix)
	{
		return serobj.fetchMarketByProductnamePrefix(prefix);
	}
	@GetMapping("/fetchMarketByProductnameSuffix/{suffix}")
	public List<Market>fetchMarketByProductnameSuffix(@PathVariable String suffix)
	{
		return serobj.fetchMarketByProductnameSuffix(suffix);
	}
	@GetMapping("/getMarketByProductamount/{productamount}/{productname}")
	public List<Market>fetchMarketByProductamount(@PathVariable String productamount,@PathVariable String productname)
	{
		return serobj.getMarketByProductamount(productamount,productname);
	}
	@DeleteMapping("/deletebyquery/{productname}")
	public String deleteMarketByProductname(@PathVariable("productname") String productname)
	{
		int result=serobj.deleteMarketByProductname(productname);
		if(result>0)
			return "Product record deleted";
		else
			return "Problem occured while deleting";
	}
	@PutMapping("/updatebyquery/{productamount}/{productname}")
	public String updateMarket(@RequestParam ("productamount")String productamount,@RequestParam ("productname")String productname)
	{
		int result= serobj.updateMarket(productamount,productname);
		if(result>0)
			return "Product record updated";
		else
			return "Problem occured while updating";
	}
	@GetMapping("/fetchbycust/{customername}")
	public List<Market> fetchMarketByCustomername(@PathVariable String customername)
	{
		return serobj.fetchMarketByCustomername(customername);
	}

}


