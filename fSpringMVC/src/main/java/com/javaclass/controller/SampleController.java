package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	
	@RequestMapping("monkey")
	public void monkey123(Model m) {
		System.out.println("원숭이");
		m.addAttribute("sound","우끼끼");
	}
	/*
	 * ModelAndView : 뷰페이지 지정과 데이터 전달시
	 * String : 이름이 다른 뷰페이지로 이동가능 쌉가능
	 * void : 요청명과 동일한 뷰페이지로 자동 지정
	 * */
}
