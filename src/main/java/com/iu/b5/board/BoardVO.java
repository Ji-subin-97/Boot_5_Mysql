package com.iu.b5.board;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class BoardVO {
	
	private Integer num;
	@NotEmpty
	private String title;
	private String contents;
	private String writer;
	private Integer hit;
	private Date regDate;
	
	private List<BoardFileVO> fileList;
}
