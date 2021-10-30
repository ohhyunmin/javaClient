package com.example.javaClient1.Vacc_Total_Stat.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.javaClient1.Vacc_Total_Stat.Model.Vacc_Total_Stat;
import com.example.javaClient1.Vacc_Total_Stat.Service.Vacc_Total_StatService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/Vacc_Total_Stat")
public class Vacc_Total_StatController {
	
	@Autowired
	private Vacc_Total_StatService vacc_Total_Stat_Service;
	
	@GetMapping(value="/list")
	public String Vacc_Total_Stat_list(HttpServletRequest reqeust, HttpServletResponse responsem, Model model) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		String data = vacc_Total_Stat_Service.Vacc_Total_Stat_list(reqeust, responsem, model);
		
		Vacc_Total_Stat vacc_Total_Stat = mapper.readValue(data, Vacc_Total_Stat.class);
        model.addAttribute("vacc_Total_Stat", vacc_Total_Stat);
        
        return "Home/index";
	}
}
