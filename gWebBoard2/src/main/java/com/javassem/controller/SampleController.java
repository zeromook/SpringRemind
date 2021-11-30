package com.javassem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("sample")
@Controller
public class SampleController {

	@RequestMapping("test.do")
	public void sample() {
		System.out.println("상대 경로");
	}
	











}
