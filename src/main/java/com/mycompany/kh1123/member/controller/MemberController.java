package com.mycompany.kh1123.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.kh1123.member.model.service.MemberService;
import com.mycompany.kh1123.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUp(@RequestParam("memberId") String memberId, @RequestParam("memberId") String memberPwd,
			@RequestParam("memberId") String memberName, Member mvo) {

		String msg;
		int result = memberService.insertMember(mvo);
		
		try {
			if (result > 0) {
				msg = "회원가입 성공";
			} else if (result == 0) {
				msg = "회원가입 실패";
			}
		} catch (Exception e) {
			msg = "회원가입 과정에서 오류 발생";
		}
		return "redirect:/";
	}

}
