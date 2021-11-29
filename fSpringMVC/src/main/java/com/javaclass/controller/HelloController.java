package com.javaclass.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("start.아무거나써도됨")
	public ModelAndView start(){
		System.out.println("start.아무거나써도됨 ////////////요청을 받음");
		//이 다음의 뷰페이지를 클라이언트에게 보내는데 자동으로 /WEB-INF/views + start + .jsp이렇게 만들어버림
		//mv.addObject("serverTime",new Date());
		//mv.addObject("name","영묵");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home"); //자동으로 /WEB-INF/views + home + .jsp이렇게 만들어버림
		
		
		ModelMap model = mv.getModelMap();
		model.addAttribute("serverTime", new Date());
		model.addAttribute("name","영묵");
		model.addAttribute("message","오늘도 행복하게 지냅시다.");
		
		
		mv.addAllObjects(model);
		return mv;
	}
	@RequestMapping("hello.아무거나써도됨")
	public ModelAndView hello(ModelMap model) {
		System.out.println("안녕~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home"); //자동으로 /WEB-INF/views + home + .jsp이렇게 만들어버림
		
		model.addAttribute("name","영묵");
		model.addAttribute("message","오늘도 행복하게 지냅시다.");
		
		mv.addObject("serverTime",new Date());
		return mv;
	}
	
	@RequestMapping("sample")
	public void sample() {
		System.out.println("복습을 합시다");
	}
}
