package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Customer;
import com.app.service.ICustomerService;
import com.app.util.CodeUtil;
import com.app.util.CodecUtil;
import com.app.util.CommonUtil;


@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CodecUtil codecUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	/**
	 * Show CustReg form
	 */
	@RequestMapping("/regCust")
	public String showPage(){
		return "CustomerReg";
	}
	
	/**
	 * save data to db
	 * 1.read cust from Container using ModelAttribute
	 */
	@RequestMapping(value="/insertCust",method=RequestMethod.POST)
	public String saveCust(@ModelAttribute("customer")Customer cust,ModelMap map){
		//2.generate pwd and token
		String pwd=codeUtil.getPwd();
		String token=codeUtil.getToken();
		
		//3.convert above data to encoded format
		String encPwd=codecUtil.doEncode(pwd);
		String encToken=codecUtil.doEncode(token);
		
		//4.set encoded pwd,tocken to cust obj
		cust.setCustPwd(encPwd);
		cust.setCustToken(encToken);
		
		//5.save data to db
		int custId=service.saveCustomer(cust);
		
		//6.send email
		if(custId!=0){
			String text=" Welcome to customer("+cust.getCustType()+")"
					+" your password is : "+pwd
					+", your Token is : "+token
					+". User Name is :"+cust.getCustEmail();
					
			commonUtil.sendEmail(cust.getCustEmail(), "Registered as Cusomter", text);
		}
		
		//7.send message to UI
		map.addAttribute("msg","Customer Registered with Id:"+custId);
				
		return "CustomerReg";
	}
	
	
	
	/**
	 * View All Records
	 */
	
	
	/**
	 * Delete record
	 */
	
	/**
	 * Update record
	 */
	
	
}
