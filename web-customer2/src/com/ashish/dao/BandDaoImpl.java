package com.ashish.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ashish.spring.entity.BandDetails;

@Service
@Repository
public class BandDaoImpl implements BandDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<BandDetails> getBandDetails() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<BandDetails> theQuery = currentSession.createQuery("from BandDetails", BandDetails.class);

		List<BandDetails> banddetails = theQuery.getResultList();

		return banddetails;
	}

}
