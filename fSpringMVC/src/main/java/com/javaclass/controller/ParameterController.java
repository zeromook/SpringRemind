package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.model.MemberVO;

@Controller
public class ParameterController {

//	@RequestMapping("param.do")
//	public String test(String id,@RequestParam(defaultValue="0") int age) {
//		System.out.println("화면에서 넘어온 값 "+id + "   and   " + age);
//		return "paramResult";
//	}
//	
//	
	@RequestMapping(value={"param.do","paramForm.do"})
	public String test(MemberVO vo ,Model m) { //Model이 보내주는 역할을 함
		System.out.println("화면에서 넘어온 값 "+vo.getId() + "   and   " + vo.getAge() + "    and    "+vo.getName());
		m.addAttribute("message","오늘도 행복합시다.");
		return "paramResult";
	}
	
	
	/*
	 *서버 (컨트롤러)에서 클라이언트(뷰)에 데이터를 전송하는 방식
	 *
	 *1. ModelAndView에 데이터를 추가하여 리턴
	 *
	 *2. 리턴하지 못하는 경우 : void이거나 String 리턴(view페이지 지정)해주는 상황일떄!
	 *		==>Model 이용(위치가 중요***)
	 *
	 * */
	
	
}
