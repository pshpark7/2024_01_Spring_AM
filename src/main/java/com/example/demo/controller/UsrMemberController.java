package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.MemberService;
import com.example.demo.vo.Member;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class UsrMemberController {

	@Autowired
	private MemberService memberService;

	public UsrMemberController() {

	}

	@RequestMapping("/usr/member/doJoin")
	@ResponseBody
	public Object doJoin(String loginId, String loginPw, String name, String nickname, String cellphoneNum,
			String email) {
		if(loginId == null || loginId.length() == 0) {
			return "아이디를 입력해주세요";
		}
		if(loginPw == null || loginPw.length() == 0) {
			return "비밀번호를 입력해주세요";
		}
		if(name == null || name.length() == 0) {
			return "이름을 입력해주세요";
		}
		if(nickname == null || nickname.length() == 0) {
			return "닉네임을 입력해주세요";
		}
		if(cellphoneNum == null || cellphoneNum.length() == 0) {
			return "전화번호를 입력해주세요";
		}
		if(email == null || email.length() == 0) {
			return "이메일을 입력해주세요";
		}
		boolean loginIdConfirm = memberService.loginIdConfirm(loginId);

		if (loginIdConfirm == false) {
			return "중복된 아이디입니다.";
		}

		int id = memberService.doJoin(loginId, loginPw, name, nickname, cellphoneNum, email);
		Member member = memberService.getMember(id);

		return member;
	}
	@RequestMapping("/usr/member/doLogin")
	@ResponseBody
	public Object doLogin(String loginId, String loginPw) {

		
		return "123";

}
}