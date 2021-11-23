package com.mycompany.kh1123.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberEnrollDt;

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberNm) {
		this.memberName = memberNm;
	}

	public String getMemberEnrollDt() {
		return memberEnrollDt;
	}

	public void setMemberEnrollDt(String memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}

	public Member(String memberId, String memberPwd, String memberName, String memberEnrollDt) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberEnrollDt = memberEnrollDt;
	}

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

}
