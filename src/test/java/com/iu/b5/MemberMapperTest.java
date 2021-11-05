package com.iu.b5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.b5.member.MemberRepository;
import com.iu.b5.member.MemberVO;

@SpringBootTest
class MemberMapperTest {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	void setInsertTest() throws Exception {
		
		MemberVO memberVO = new MemberVO();
		memberVO.setId("test2");
		memberVO.setPw("test2");
		memberVO.setName("test2");
		memberVO.setEmail("test2@gmail.com");
		
		int result = memberRepository.setInsert(memberVO);
		
		assertNotEquals(0, result);
	}

}
