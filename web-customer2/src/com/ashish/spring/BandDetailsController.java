package com.ashish.spring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ashish.dao.BandDao;
import com.ashish.spring.entity.BandCo;






@Controller
@RequestMapping("/banddetails")
public class BandDetailsController {

	@Autowired
	private BandDao bandDetailsDAO;
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		List<BandCo> theBandDetails = bandDetailsDAO.getBandDetails();
		
		theModel.addAttribute("bandDetails", theBandDetails);
		
		return "list";
	}
	@RequestMapping("/showFormAdd")
	public String showFormAdd(Model model)
	{
		BandCo theBandCo = new BandCo();
		
		model.addAttribute("bandForm", theBandCo);
		
		
		return "newform";
	}
	@PostMapping("/savedata")
	public String saveData(@ModelAttribute("bandForm") BandCo theBandCo)
	
	{
		bandDetailsDAO.saveData(theBandCo);
		
		return "redirect:/banddetails/list";
	}
	
}