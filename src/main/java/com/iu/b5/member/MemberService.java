package com.iu.b5.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private FileManager fileManager;
	
	public int addMemberJoin(MemberVO memberVO, MultipartFile file) throws Exception {
		
		int result = memberRepository.setInsert(memberVO);
		
		if(!file.isEmpty()) {
			
			String fileName = fileManager.getUseClassPathResource("/upload/member/" + memberVO.getId(), file);
			
			MemberFilesVO memberFilesVO = new MemberFilesVO();
			memberFilesVO.setMember_id(memberVO.getId());
			memberFilesVO.setFileName(fileName);
			memberFilesVO.setFileOrilName(file.getOriginalFilename());
			result = memberRepository.setFileInsert(memberFilesVO);
		
		}
		
		return result;
	}
	
}
