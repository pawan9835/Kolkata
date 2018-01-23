package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Location;
import com.app.model.Vendor;
import com.app.service.IVendorService;
import com.app.util.CommonUtil;
import com.app.util.LocationUtil;

@Controller
public class VendorController {
	@Autowired
	private IVendorService service;
	@Autowired
	private CommonUtil commonUtil;
	
	/**
	 * To integrate location with
	 * vendor using Locationutil
	 * has-a with vendorcontroller
	 */
	@Autowired
	private LocationUtil locUtil;
	
	
	@RequestMapping("/regVen")
	public String showVenReg(ModelMap map){
		List<Location> locList=locUtil.getAllLocations();
		map.addAttribute("locListObj", locList );
		return "VendorReg";
	}
	
	@RequestMapping(value="insertVen",method=RequestMethod.POST)
	public String insertVen(
			@ModelAttribute("vendor")Vendor ven,
			ModelMap map,
			@RequestParam("inpFile")CommonsMultipartFile file){
		int venId=service.saveVendor(ven);
		
		String msg="Vendor Saved with id:"+venId;
		map.addAttribute("msg", msg);
		
		/**send email also**/
		
		commonUtil.sendEmail(ven.getVenEmail(), "Registered as Vendor", msg,file);
		
		/**adding lines to display locations after insert*/ 
		List<Location> locList=locUtil.getAllLocations();
		map.addAttribute("locListObj", locList );
		/**end*/
		return "VendorReg";
	}
	
	@RequestMapping("/viewAllVen")
	public String viewAllVen(ModelMap map){
		List<Vendor> vList=service.getAllVendors();
		map.addAttribute("venListObj", vList);
		return "VendorData";
	}
	
	
}
