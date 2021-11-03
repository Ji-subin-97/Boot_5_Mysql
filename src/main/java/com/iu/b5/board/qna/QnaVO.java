package com.iu.b5.board.qna;

import com.iu.b5.board.BoardVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaVO extends BoardVO{
	
	private Integer ref;
	private Integer step;
	private Integer depth;
	
}
