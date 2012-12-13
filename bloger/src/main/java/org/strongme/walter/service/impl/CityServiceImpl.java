package org.strongme.walter.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;
import org.strongme.walter.dao.CityDao;
import org.strongme.walter.pojo.City;
import org.strongme.walter.service.CityService;

@Component
public class CityServiceImpl implements CityService {
	
	@Resource
	private CityDao cityDao;

	@Override
	public City getCityById(int id) {
		return cityDao.getCityById(id);
	}

	@Override
	public List<City> getByCityPage(int startPage, int size) {
		return cityDao.getCityByPage(startPage, size);
	}

}
