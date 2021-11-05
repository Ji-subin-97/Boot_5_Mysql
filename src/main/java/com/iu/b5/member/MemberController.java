package com.iu.b5.member;

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
	
	@GetMapping("memberJoin")
	public String goToMemberJoin() throws Exception {
		
		return "member/memberJoin";
	}
	
	@PostMapping("memberJoin")
	public String addMemberJoin(MemberVO memberVO, MultipartFile file) throws Exception {
		
		int result = memberService.addMemberJoin(memberVO, file);
		
		return "redirect:../?result=" + result;
	}
}
