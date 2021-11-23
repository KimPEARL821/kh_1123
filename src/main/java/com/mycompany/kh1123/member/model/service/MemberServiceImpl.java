package com.mycompany.kh1123.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.kh1123.member.model.dao.MemberDao;
import com.mycompany.kh1123.member.model.vo.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	
	public int insertMember(Member enrollMem) {
		int result = memberDao.insertMember(enrollMem);
		return result;
	}

}
