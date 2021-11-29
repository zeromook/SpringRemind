package com.javassem.controller;

import java.util.Date;
import java.util.List;

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
	
	//글목록 보기
	@RequestMapping("getBoardList.do")
	public void select(Model m) {
		List<BoardVO> list = boardService.getBoardList();
		m.addAttribute("boardList",list);
	}
	
	// 해당 글보기
	@RequestMapping("getBoard.do")
	public void getBoard(BoardVO vo, Model m) {		// public void getBoard(int seq) 가능
		BoardVO result = boardService.getBoard(vo);
		m.addAttribute("board", result);
	}

	
	//글삭제
	@RequestMapping("deleteBoard.do")
	public String delete(BoardVO vo){
		System.out.println("(글 삭제...)");
		boardService.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	//글수정
	@RequestMapping("updateBoard.do")
	public String update(BoardVO vo,Model m){
		System.out.println("(글 수정...)");
		boardService.updateBoard(vo);
		m.addAttribute("seq",vo.getSeq());
		return "redirect:getBoard.do";
	}

	
	
}
