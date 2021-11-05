package com.iu.b5.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.iu.b5.member.MemberVO;

@Repository
@Mapper
public interface AdminRepository {
	
	public List<MemberVO> getMemberList() throws Exception;
	
}
