package com.ashish.dao;

import java.util.List;

import com.ashish.spring.entity.BandCo;

public interface BandDao {
	
	public List<BandCo> getBandDetails();

	public void saveData(BandCo theBandCo);

}
