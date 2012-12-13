package org.strongme.walter.dao;

import java.util.List;

import org.strongme.walter.pojo.City;

public interface CityDao {

	List<City> getCityByPage(int startPage,int size);
	
	City getCityById(int id);
	
}
