package com.ashish.spring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashish.dao.BandDao;

import com.ashish.spring.entity.BandDetails;






@Controller
@RequestMapping("/customer")
public class BandDetailsController {

	@Autowired
	private BandDao bandDetailsDAO;
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		List<BandDetails> theBandDetails = bandDetailsDAO.getBandDetails();
		
		theModel.addAttribute("bandDetails", theBandDetails);
		
		return "list";
	}
	
}