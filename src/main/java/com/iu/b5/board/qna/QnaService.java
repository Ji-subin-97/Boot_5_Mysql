package com.iu.b5.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.board.BoardFileVO;
import com.iu.b5.board.BoardService;
import com.iu.b5.board.BoardVO;
import com.iu.b5.util.FileManager;
import com.iu.b5.util.Pager;

@Service
public class QnaService implements BoardService{
	
	@Autowired
	private QnaMapper qnaMapper;
	
	@Autowired
	private FileManager fileManager;
	
	@Override
	public int setInsert(BoardVO boardVO, MultipartFile [] files) throws Exception {
		// TODO Auto-generated method stub
		int result = qnaMapper.setInsert(boardVO);
		
		result = qnaMapper.setRefUpdate(boardVO);
		
		
		for(MultipartFile multi:files) {		
			if(multi.isEmpty()) {
				continue;
			}
			
//			String fileName = fileManager.getUseServletContext("/upload/notice/", multi);
//			fileManager.getUseResourceLoader("/upload/notice/", multi);
			String fileName = fileManager.getUseClassPathResource("/upload/qna/", multi);
			
			BoardFileVO boardFileVO = new BoardFileVO();
			boardFileVO.setNum(boardVO.getNum());
			boardFileVO.setFileName(fileName);
			boardFileVO.setFileOriName(multi.getOriginalFilename());
			qnaMapper.setFileInsert(boardFileVO);
		}
		
		return result;
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaMapper.setUpdate(boardVO);
	}

	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaMapper.setDelete(boardVO);
	}

	@Override
	public BoardVO getSelectOne(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaMapper.getSelectOne(boardVO);
	}

	@Override
	public List<BoardVO> getSelectList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();
		//1. 총글의 갯수 - DB에서 조회
		Long totalCount = qnaMapper.getTotalCount(pager);
		pager.makeNum(totalCount);
		return qnaMapper.getSelectList(pager);
	}
	
}
