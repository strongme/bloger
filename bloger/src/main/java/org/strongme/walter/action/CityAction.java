package org.strongme.walter.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.strongme.walter.pojo.City;
import org.strongme.walter.service.CityService;

import com.opensymphony.xwork2.ActionSupport;

public class CityAction extends ActionSupport {
	
	@Resource
	private CityService cityService;
	
	private City city;
	private List<City> cities;
	
	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	
	@Override
	public String execute() throws Exception {
		System.out.println(cityService==null);
		HttpServletRequest request = ServletActionContext.getRequest();
		Integer startPage = Integer.valueOf(request.getParameter("startPage"));
		Integer size = Integer.valueOf(request.getParameter("size"));
		this.city = cityService.getCityById(3);
		this.cities = cityService.getByCityPage(startPage,size);
		return SUCCESS;
	}

}
