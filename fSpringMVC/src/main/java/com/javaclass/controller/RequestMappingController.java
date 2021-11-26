package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.model.MemberVO;

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
	
	
	@RequestMapping(value="request.do",method=RequestMethod.POST)  //이렇게 하면 GET방식으로 전달은 오류발생 POST만 허용함
	public void test3(MemberVO vo) { //@ModelAttribute("vo")이거를 매개변수 칸에 넣어두면 jsp에서 MemberVO를 부를때 vo로 부를수있음 하지만 기본은 memberVO 기존 클래스명에서 앞글자만 소문자로바꿈
		System.out.println("아이디 : "+vo.getId());
		System.out.println("이름 : "+vo.getName());
		System.out.println("나이 : "+vo.getAge());
		
		//원래 자바에서는
		/*
		 * String id = request.getParameter("id");
		 * String name = request.getParameter("id");
		 * int age = Integer.parseInt(request.getParameter("age"));
		 * 
		 * MemberVO vo = new MemberVO();
		 * vo.setId(id);
		 * vo.setName(name);
		 * vo.setAge(age);
		 * 
		 * */
	}
	
	
	
	
	
	
	
}
