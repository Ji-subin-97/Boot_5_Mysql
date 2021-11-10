package com.iu.b5.board.qna;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iu.b5.board.BoardMapper;
import com.iu.b5.board.BoardVO;
import com.iu.b5.util.Pager;

@Mapper
public interface QnaMapper extends BoardMapper{
	
	public int setReplyInsert(BoardVO boardVO) throws Exception;
	public int setRefUpdate(BoardVO boardVO) throws Exception;
	public int setReplyUpdate(BoardVO boardVO) throws Exception;
	
}
