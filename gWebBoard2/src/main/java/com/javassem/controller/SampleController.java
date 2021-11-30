package com.javassem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("sample/test.do")
	public void sample() {
		System.out.println("상대 경로");
	}
	
	@RequestMapping("/sample/test.do")
	public void sample2() {
		System.out.println("절대 경로");
	}










}
