package com.javassem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
@RequestMapping("user")
public class MemberController {
	
	@Autowired
	private MemberService memberservice;

	@RequestMapping("{step}")
	public String userJoin(@PathVariable String step) {
		return "user/"+step;
	}
	
	@RequestMapping("userInsert")
		public String userInsert(MemberVO vo,HttpSession session) {
			int result = memberservice.userInsert(vo);
			String message = "가입을 축하드립니다.";
			if(result == 0)message = "가입에 실패하였습니다.";
			session.setAttribute("message",message);
			return "user/userJoin_ok";
		}
	
	@RequestMapping("login")
	public String userlogin(MemberVO vo,HttpSession session) {
		MemberVO result = memberservice.idCheck_Login(vo);
		if(result != null) {
			session.setAttribute("name",result.getUserName());
			return "user/login_ok";
		}
		return "user/userLogin";
	}
	
	@RequestMapping("sample")
	public String today(Model m) {
		String result = memberservice.today();
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("오늘날짜 = "+result);
		System.out.println("----------------------------------------------------------------------------------------");
		m.addAttribute("today",result);
		return "today";
	}
	
	
	
	
	@RequestMapping(value="idCheck",produces="application/text; charset=UTF-8")//보내는 한글처리
	@ResponseBody//ajax를 통해 받을때는 붙여야함 [비동기통신]**********************************
	public String idCheck(MemberVO vo) {
		MemberVO result = memberservice.idCheck_Login(vo);
		String message = "사용가능한 아이디입니다.";
		if(result != null) {
			message = "이미 존재하는 아이디입니다.";
		}
		return message; //ajax를 타고 가는거라 view페이지로 이동하지않음!!!!!!!!!!!!!!!!!!!!!!정말 String결과값만 return됨
	}
	

	
}
