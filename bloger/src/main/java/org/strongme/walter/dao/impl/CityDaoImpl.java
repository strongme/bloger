package org.strongme.walter.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.strongme.walter.dao.CityDao;
import org.strongme.walter.pojo.City;

@Component
public class CityDaoImpl implements CityDao {

	@Resource
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<City> getCityByPage(final int startPage, final int size) {
		List<City> result = hibernateTemplate
				.executeFind(new HibernateCallback<Object>() {
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
							Query query = session.createQuery("from City");
							query.setFirstResult(startPage);
							query.setMaxResults(size);
						return query.list();
					}
				});
		return result;
	}

	@Override
	public City getCityById(int id) {
		return hibernateTemplate.get(City.class, id);
	}

}
