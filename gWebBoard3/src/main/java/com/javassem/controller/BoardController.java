package com.javassem.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

		@RequestMapping("/{step}")
		public String viewPage(@PathVariable String step) {
			return step;
		}
	
		// 글 목록 검색
		@RequestMapping("/getBoardList")
		public void getBoardList(BoardVO vo, Model model) {
			System.out.println("-----------글목록 검색을 시작합니다----------");
			List<BoardVO> list =  boardService.getBoardList(vo);
			model.addAttribute("boardList",list);
			
		}
	
		// 글 등록
		@RequestMapping(value = "/saveBoard")
		public String insertBoard(BoardVO vo) throws IOException {
			boardService.insertBoard(vo);
			return "redirect:getBoardList";
		}

		// 글 수정
		@RequestMapping("/updateBoard")
		public String updateBoard(BoardVO vo) {
			boardService.updateBoard(vo);
			return "redirect:getBoardList";
		}

		// 글 삭제
		@RequestMapping("/deleteBoard")
		public String deleteBoard(BoardVO vo) {
			boardService.deleteBoard(vo);
			vo.deletefile(vo.getB_fname());
			return "redirect:getBoardList";
		}

		// 글 상세 조회
		@RequestMapping("/getBoard")
		public void getBoard(BoardVO vo,Model m) {
			BoardVO hey = boardService.getBoard(vo);
			m.addAttribute("board",hey);
		}
		
		//이미지목록 출력하기
		@RequestMapping("imagelist")
		public void imglist(BoardVO vo,Model m) {
			List<BoardVO> list =  boardService.getBoardList(vo);
			m.addAttribute("ImgList",list);
		}
		

	}
