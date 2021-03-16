package com.atworks.kjh.DAO;

import com.atworks.kjh.DTO.MemberDTO;

public interface MemberDAO {

	// 회원 가입
	public void join(MemberDTO dto) throws Exception;
	
}
