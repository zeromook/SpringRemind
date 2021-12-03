package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.dao.ReplyDAO;
import com.javassem.domain.ReplyVO;

@RestController
public class ReplyController {
	
	@Autowired
	ReplyDAO rdao;
	
	@GetMapping(value="/replies/new", produces="application/text; charset=UTF-8")
	public String insert(ReplyVO vo) {
		rdao.insertReply(vo);
		return "댓글 입력이 완료되었습니다.";
	}
	
	@GetMapping(value="replies")
	public List<ReplyVO> selectAllReply() {
		List<ReplyVO> li = rdao.selectAllReply();
		return li;
	}
	
	@GetMapping(value="replies/{rno}",produces="application/text; charset=UTF-8")
	public String delete(@PathVariable String rno, ReplyVO vo) {
		System.out.println(rno+"번째 댓글을 삭제하였습니다.");
		Integer result = rdao.deleteReply(vo);
		return rno+"번째 댓글을 삭제하였습니다.";
	}

	 @GetMapping("replies/update")
	 public void update(ReplyVO vo) {
	     int result = rdao.updateReply(vo);
	 }
}
