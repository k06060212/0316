package com.atworks.kjh.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atworks.kjh.DAO.MemberDAO;
import com.atworks.kjh.DTO.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO dao;
	
	@Override
	public void join(MemberDTO dto) throws Exception {
		// TODO Auto-generated method stub
		dao.join(dto);
	}

}
