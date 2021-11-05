package com.iu.b5.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.b5.member.MemberVO;

@Controller
@RequestMapping("/admin/**")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("memberList")
	public ModelAndView getMemberList() throws Exception {
		
		List<MemberVO> memberList = adminService.getMemberList();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("memberList", memberList);
		mv.setViewName("admin/memberList");
			
		return mv;
	}
}
