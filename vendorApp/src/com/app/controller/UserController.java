package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserService;
import com.app.util.CodeUtil;
import com.app.util.CommonUtil;

@Controller
public class UserController {
	@Autowired
	private IUserService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	
	/**
	 * show reg page
	 */
	@RequestMapping("/regUser")
	public String showPage(){
		return "UserReg";
	}
	/**
	 * insert data to DB
	 */
	@RequestMapping(value="/insertUser",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user")User user,ModelMap map){
		//gen pwd
		String pwd=codeUtil.getPwd();
		user.setUserPwd(pwd);
		int userId=service.saveUser(user);
		map.addAttribute("msg","User Registered with Id:"+userId);
		//send email
		String text="welcome to user. Id is:"+user.getUserEmail()+
				", password is:"+user.getUserPwd();
		commonUtil.sendEmail(user.getUserEmail(), "User Registered..", text);
		return "UserReg";
	}
	
	
	

	/**
	 * Login process
	 */
	
	
	/**
	 * Logout process
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




