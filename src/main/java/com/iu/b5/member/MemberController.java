package com.iu.b5.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/*======================= Member Join =======================*/
	
	@GetMapping("memberJoin")
	public String goToMemberJoin() throws Exception {
		
		return "member/memberJoin";
	}
	
	@PostMapping("memberJoin")
	public String addMemberJoin(MemberVO memberVO, MultipartFile file) throws Exception {
		
		int result = memberService.addMemberJoin(memberVO, file);
		
		return "redirect:../?result=" + result;
	}
	
	/*======================= Member Login =======================*/
	
	@GetMapping("memberLogOut")
	public String getLogOut(HttpSession session) throws Exception {
		session.invalidate();
		
		return "redirect:../";
	}
	
	@GetMapping("memberLogin")
	public String goToMemberLogin() throws Exception {
		
		return "member/memberLogin";
	}
	
	@PostMapping("memberLogin")
	public String setMemberLogin(MemberVO memberVO, HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();	
		String member_id = memberService.setMemberLogin(memberVO);
		
		if(member_id != null) {
			session.setAttribute("member", member_id);
		}
		
		return "redirect:../";
	}
	
	/*======================= Member List =======================*/
}
