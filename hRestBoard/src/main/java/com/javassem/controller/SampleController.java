package com.javassem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO;

@RestController //@Controller + @ResponseBody를 합친 개념 리턴을 데이터 그대로 리턴함 jsp파일명으로 가지않음
public class SampleController {

	
	//1. 문자열 반환
	@GetMapping(value="getText",produces="application/text; charset=UTF-8")
	public String getTest() {
		return "컨트롤러에서 보냈다 오바";
	}
	
	//2. 객체 반환
	@GetMapping(value="getObject")
	public Object getObject() {
		SampleVO vo = new SampleVO("홍길동",24,"안녕하세요");
		return vo;
	}
	
	//3. 리스트객체 반환
	@GetMapping(value="getList")
	public List getList() {
		List list = new ArrayList();
		list.add(new SampleVO("홍씨",22,"오늘도 행복"));
		list.add(new SampleVO("김씨",32,"하하하하하"));
		list.add(new SampleVO("최씨",42,"후후후후후후"));
		return list;
	}
	
	
	//4. 카테고리(파라미터)의 값 얻기
	@GetMapping("sample/{cate}/{cno}")
	public String[] getPath(@PathVariable String cate , @PathVariable Integer cno) {
		return new String[] {"카테고리:"+cate,"글번호:"+cno};
	}
	//5. Path값 가져오기
	@PostMapping("sample/data")
	public SampleVO post(SampleVO vo) {
		return vo;
	}
		
	
}
