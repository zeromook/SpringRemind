package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;
import com.javaclass.model.MemberVOList;

@Controller
public class UserListController {

	@RequestMapping("multiInsert.do")
	public String test(MemberVOList memberVOList) {
		for(MemberVO a : memberVOList.getList()) {
			System.out.println("선택여부 :"+a.isState() + ">아이디 :" + a.getId() + " >이름 :" + a.getName());
		}
		
		return "userListResult";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
