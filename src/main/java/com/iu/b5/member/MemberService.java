package com.iu.b5.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private FileManager fileManager;
	
	//검증 메서드 선언
	public boolean memberError(MemberVO memberVO, BindingResult bindingResult) throws Exception {
		
		boolean check = false;
		//false : 검증 성공
		//true : 검증 실패(위반이 있음)
		
		//1. 어노테이션 검증
		check = bindingResult.hasErrors();
		
		//2. password가 일치하는지 검증
		if(!memberVO.getPw().equals(memberVO.getPwCheck())) {
			bindingResult.rejectValue("pwCheck", "pwCheck");
			check = true;
		}
		
		//3. id 중복 검증
		memberVO = memberRepository.getSelect(memberVO);
		if(memberVO != null) {
			bindingResult.rejectValue("id", "member.id.equals");
			check = true;
		}
		
		return check;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int addMemberJoin(MemberVO memberVO, MultipartFile file) throws Exception {
		
		//aop 관점지향언어
		
		int result = memberRepository.setInsert(memberVO);
		
		if(!file.isEmpty()) {
			
			String fileName = fileManager.getUseClassPathResource("/upload/member/" + memberVO.getId(), file);
			
			MemberFilesVO memberFilesVO = new MemberFilesVO();
			memberFilesVO.setMember_id(memberVO.getId());
			memberFilesVO.setFileName(fileName);
			memberFilesVO.setFileOrilName(file.getOriginalFilename());
			result = memberRepository.setFileInsert(memberFilesVO);
			
			if(result == 0) {
				throw new Exception();
			}
		}
		
		return result;
	}
	
	public String setMemberLogin(MemberVO memberVO) throws Exception {
		
		return memberRepository.setMemberLogin(memberVO);
	}
	
}
