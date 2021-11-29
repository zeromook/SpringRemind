package com.javaclass.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller
public class ParameterController {

	
	   @RequestMapping("paramForm.do")
	   public String paramForm(MemberVO vo,HttpSession session) {
//	      System.out.println("화면에서 넘어온 값 " + vo.getId());
//	      System.out.println("화면에서 넘어온 값 " + vo.getAge());
//	      System.out.println("화면에선 넘어온 값 " + vo.getName());
		   
		   String dbid = "002";
		   String dbname = "정영묵";
		   
		   //로그인 성공
		   if(dbid.equals(vo.getId()) && dbname.equals(vo.getName())) {
			   session.setAttribute("name",vo.getName());
			   return "paramForm";
		   }
		   //로그인 실패
		   else {
			   return "monkey";
		   }
	   }
	   
	   
	   
	   @RequestMapping(value={"param.do"})
	   public String test(MemberVO vo, Model m) {
	      System.out.println("화면에서 넘어온 값 " + vo.getId());
	      System.out.println("화면에서 넘어온 값 " + vo.getAge());
	      System.out.println("화면에선 넘어온 값 " + vo.getName());
	      m.addAttribute("message","오늘도 행복합시다");
	      
	      return "paramResult";
	   }
	   
	
}
