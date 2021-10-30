package com.example.javaClient1.Vacc_Total_Stat.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

public interface Vacc_Total_StatService {
	
	public String Vacc_Total_Stat_list(HttpServletRequest reqeust, HttpServletResponse responsem, Model model) throws Exception;
}
