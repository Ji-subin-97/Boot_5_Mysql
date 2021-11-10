package com.iu.b5.member;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberVO {
	
	@NotEmpty
	private String id; // 비어있으면 X
	@Size(min = 6, max = 12)
	private String pw;	// 6글자 이상 12글자 이하
	private String pwCheck; 
	@NotEmpty
	private String name; // 비어있으면 X
	@Email
	private String email; // email 형식이어야 함
	@Range(min = 0, max = 150)
	private Integer age; // 0~150
	@DateTimeFormat(pattern = "yyyyMMdd")
    @Past
	private java.util.Date birth; // 생년월일 현재보다 과거이어야 함
	private String role; 
	
	private List<MemberFilesVO> memberFileList;
	
}
