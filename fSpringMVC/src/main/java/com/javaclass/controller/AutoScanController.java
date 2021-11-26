package com.javaclass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaclass.model.MemberVO;

@Controller
public class AutoScanController {

	@Autowired
	private MemberVO vo;
	
	
	@RequestMapping("autoScan.do")
	public ModelAndView AutoScan() {
		System.out.println("AutoScan이 실행됩니다...................");
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("autoScan");
		mv.addObject("mVO",vo);
		
		return mv;
	}
}
