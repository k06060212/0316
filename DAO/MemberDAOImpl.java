package com.atworks.kjh.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atworks.kjh.DTO.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Autowired
	private SqlSession sqlsession;
	
	//회원가입
	@Override
	public void join(MemberDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sqlsession.insert("memberMapper.join", dto);
	}
	
	
}
