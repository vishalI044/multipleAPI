package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Response.ApiEntity;
import com.Response.ApiEntityOne;

@Service
public class ApiService {

	@Autowired
	public RestTemplate restTemplate;

	public ApiEntity firstApi() {
		return restTemplate.getForObject(
				"https://stock-market-data.p.rapidapi.com/market/index/"
						+ "s-and-p-six-hundred?rapidapi-key=3db93545c3mshce54db9c866f450p1ae782jsn9148f1d0524a",
				ApiEntity.class);
	}

	public ApiEntity secondApi() {
		return restTemplate.getForObject(
				"https://stock-market-data.p.rapidapi.com/market/index/"
						+ "s-and-p-six-hundred?rapidapi-key=3db93545c3mshce54db9c866f450p1ae782jsn9148f1d0524a",
				ApiEntity.class);
	}

	public ApiEntityOne thirdApi() {
		
		String url = "https://stock-market-data.p.rapidapi.com/market/index/"+
		"s-and-p-six-hundred?rapidapi-key=3db93545c3mshce54db9c866f450p1ae782jsn9148f1d0524a";
		
		return restTemplate.getForObject(url, ApiEntityOne.class);
	}
	
	
}
