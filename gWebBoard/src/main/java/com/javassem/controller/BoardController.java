package com.javassem.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("insertBoard.do")
	public void test() {
		
	}

	@RequestMapping("saveBoard.do")
	public String save(BoardVO vo,Model m) {
		boardService.insertBoard(vo);
		m.addAttribute("serverTime",new Date());
		return "home";
	}
	
	
	
	
	
	
	
	
	
	
}
