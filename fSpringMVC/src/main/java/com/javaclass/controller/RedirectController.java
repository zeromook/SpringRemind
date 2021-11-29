package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("insert.do")
	public String insert() {
		System.out.println("게시글 입력");
		//페이지 리다이렉트###########
		return "redirect:select.do";
	}
	@RequestMapping("select.do")
	public void select() {
		System.out.println("게시글 목록보기");
	}
	
}
