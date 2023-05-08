package com.MTickets.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MTickets.Entity.Market;
import com.MTickets.Repository.MarketRepository;

import jakarta.transaction.Transactional;

@Service

public class MarketService {
	
	MarketRepository repobj;

	
	public List<Market> fetchMarketByProductnamePrefix(String prefix)
	{
		  return repobj.findByProductnameStartingWith(prefix);
	}
	public List<Market> fetchMarketByProductnameSuffix(String suffix)
	{
		  return repobj.findByProductnameEndingWith(suffix);
	}
	public List<Market> getMarketByProductamount(String productamount,String productname)
	{
		  return repobj.getMarketByProductamount(productamount,productname);
		  
	}

	@Transactional
	public int deleteMarketByProductname(String productname)
	{
		return repobj.deleteMarketByProductname(productname);
		
	}
	@Transactional
	public int updateMarket(String productamount,String productname)
	{
		return repobj.updateMarket(productamount, productname);
	}
	@Transactional
	public List<Market> fetchMarketByCustomername(String customername)
	{
		return repobj.fetchMarketByCustomername(customername);
	}

}
