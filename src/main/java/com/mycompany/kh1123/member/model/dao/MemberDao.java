package com.mycompany.kh1123.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.kh1123.member.model.vo.Member;

@Repository
public class MemberDao {
	@Autowired
	private SqlSession sqlSession;

	public int insertMember(Member enrollMem) {
		System.out.println("SDFSDF: "+enrollMem);

		int result = sqlSession.insert("Member.insertMember",enrollMem);
		return result;
	}
}
