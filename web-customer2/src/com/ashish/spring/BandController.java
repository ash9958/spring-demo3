package com.ashish.spring;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bandOptions")
public class BandController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		

		model.addAttribute("band",new Band());

		return "band-form";
	}

	@RequestMapping("/stuform")
	public String stuForm(@ModelAttribute("band") Band theStudent)

	{
		

		return "submit";
	}

}
