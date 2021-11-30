package com.javaclass.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaclass.domain.MemberVO;

//### (1) 해당 어노테이션 지정
@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{

	//### (2) 해당 어노테이션 지정
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void insertMember(MemberVO vo) {
		sqlSession.insert("MemberDAO.insertMember", vo);
	}
	
	//---------------------------------------------
	public MemberVO loginCheck(MemberVO vo) {
		return sqlSession.selectOne("MemberDAO.loginCheck", vo);
	}
}
