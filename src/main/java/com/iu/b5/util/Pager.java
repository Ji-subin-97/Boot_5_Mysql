package com.iu.b5.util;

import lombok.Data;

@Data
public class Pager {
	
	private String kind;
	private String search;
	
	/*----------------------
	 * A. 한 페이지에 몇개 씩 조회
	 * : perPage = 10
	 * 
	 * B. 현재 페이지 번호
	 * : pn
	 * 
	 * 
	 * 1. 일정한 갯수 만큼 DB조회
	 * (pn-1)*perPage
	 * 
	 * 2. Page 번호 처리
	 * 1) 총글의 갯수 - DB에서 조회
	 * 2) 총페이지의 갯수 구하기
	----------------------*/
	private Integer perPage; // 페이지 번호
	private Integer pn;		 // 한 페이지에 출력할 갯수
	private Integer startRow;// limit의 시작 번호
	
	public void makeRow() {
		this.startRow = (this.getPn()-1) * this.getPerPage();
	}
	
	
	/*---------검증---------*/
	
	public Integer getPn() {
		if(this.pn==null || this.pn==0) {
			this.pn = 1;
		}
		
		return pn;
	}
	
	public Integer getPerPage()  {
		if(this.perPage==null || this.perPage==0) {
			this.perPage = 10;
		}
		
		return perPage;
	}
	
}
