package com.acorn.shoopse.agency.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.acorn.shoopse.agency.dto.AgencyDto;
import com.acorn.shoopse.agency.service.AgencyService;
import com.acorn.shoopse.manager.service.ManagerService;
import com.acorn.shoopse.products.dto.ProductsKindDto;

@Controller
public class AgencyController {
	
	@Autowired
	private AgencyService agencyService;
	
	@Autowired
	private ManagerService managerService;

	@RequestMapping("/manager/insertformagency")
	public ModelAndView insertformAgency(){
		ModelAndView mView = new ModelAndView();
		mView.setViewName("manager/insertform_agency");
		return mView;
	}
	
	@RequestMapping("manager/insertagency")
	public String insert(@ModelAttribute AgencyDto dto){
		agencyService.insert(dto);
		return "redirect:agencylist.do";
	}
	
	@RequestMapping("manager/agencylist")
	public ModelAndView getList(){
		ModelAndView mView=agencyService.getList();
		mView.setViewName("manager/agency_list");
		return mView;
	}

	@RequestMapping("/manager/insertformwarehousing")
	public ModelAndView insertformWarehousing(){
		ModelAndView mView = agencyService.getList();
		mView.setViewName("manager/insertform_warehousing");
		
		return mView;
	}
	

}






