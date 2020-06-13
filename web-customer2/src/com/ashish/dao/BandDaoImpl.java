package com.ashish.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ashish.spring.entity.BandCo;

@Service
@Repository
public class BandDaoImpl implements BandDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<BandCo> getBandDetails() {

		Session currentSession = sessionFactory.getCurrentSession();

		Query<BandCo> theQuery = currentSession.createQuery("from BandCo", BandCo.class);

		List<BandCo> banddetails = theQuery.getResultList();

		return banddetails;
	}

	@Override
	@Transactional
	public void saveData(BandCo theBandCo) {
		Session cuSession = sessionFactory.getCurrentSession();
		cuSession.save(theBandCo);
	}

}
