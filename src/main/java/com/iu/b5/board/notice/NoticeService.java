package com.iu.b5.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.b5.board.BoardService;
import com.iu.b5.board.BoardVO;
import com.iu.b5.util.Pager;

@Service
public class NoticeService implements BoardService{
	
	// DI IOC
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.setInsert(boardVO);
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.setUpdate(boardVO);
	}

	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.setDelete(boardVO);
	}

	@Override
	public BoardVO getSelectOne(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.getSelectOne(boardVO);
	}

	@Override
	public List<BoardVO> getSelectList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();
		return noticeMapper.getSelectList(pager);
	}
	
}
