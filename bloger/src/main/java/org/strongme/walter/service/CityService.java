package org.strongme.walter.service;

import java.util.List;

import org.strongme.walter.pojo.City;

public interface CityService {
	
	City getCityById(int id);

	List<City> getByCityPage(int startPage,int size);
}
