package com.linjith.webinar.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linjith.webinar.models.Country;

@RestController
@RequestMapping("/api/v1/dashboard")
public class DashboardController {
	
	@GetMapping("/country-list")
	public List<Country> getCountryList(){
		List<Country> dashboardCountryList = new ArrayList<>();
		
		dashboardCountryList.add(new Country("Argentina","Spanish","41,803,125","31.3","2,780,387"));
		dashboardCountryList.add(new Country("Australia","English","23,630,169","37.3","7,739,983"));
		dashboardCountryList.add(new Country("Greece","Greek","11,128,404","43.2","131,956"));
		dashboardCountryList.add(new Country("Luxembourg","Luxermbourgish","536,761","39.1","2,586"));
		dashboardCountryList.add(new Country("Russia","Russian","142,467,651","38.4","17,076,310"));
		dashboardCountryList.add(new Country("Sweden","Swedish","9,631,261","41.1","449,954"));
		
		return dashboardCountryList;
	}

}
