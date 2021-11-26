package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("re")
public class RequestMappingController {

	@RequestMapping(value={"a.do","b.do"})//한개만 부를때 value=는 default값 안써도 됨
	public String test(){
		System.out.println("a.do & b.do 요청쓰");
		return "start";
	}
	//WEB-INF/views + start + .jsp
	//********************************중요!!!!!!!!!!!
	//SpringMVC에서 return값이 String인 경우는 값을 전달하는 것이 아니라 뷰페이지명을 지정하는것임.
	
	

	
	
	
//	@RequestMapping(value="c.do",params={"id=kim"})//한개만 부를때 value=는 default값 안써도 됨
//	public String test12(){
//		System.out.println("c두 요청쓰");
//		return "c";
//	}
//	
	
	//위아래 방법에 둘다 결과는 동일
	
	
	
	//위에서 re로 경로를 정해주어서 찾기는 하나 위와는 다르게 jsp파일이 없음으로 re/c.jsp경로로 만들어주어야한다.
	@RequestMapping(value="c.do",params={"id=kim"})
	public void test2(){
		System.out.println("(-c.do와 파라미터 요청 필요-)");
	}
	
	
	
	
	
	
	
	
}
