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
	 * 3) 총블럭의 갯수 구하기
	 * 4) pn으로 현재 블럭번호 구하기
	 * 5) curBlock을 이용해서 시작번호, 끝번호 구하기
	----------------------*/
	private Integer perPage; // 한 페이지에 출력할 갯수
	private Integer pn;		 // 페이지 번호
	private Integer startRow;// limit의 시작 번호
	
	/*---------계산---------*/
	public void makeNum(Long totalCount) { // 104개
		//2. 총페이지의 갯수 구하기
		Long totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;
		}
		
		//3. 총블럭의 갯수 구하기
		Long perBlock = 5L;
		Long totalBlock = totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
		
		//4. pn으로 현재 블럭번호 구하기
		Long curBlock = this.getPn()/perBlock;
		if(this.getPn()%perBlock != 0) {
			curBlock++;
		}
		
		//5. curBlock을 이용해서 시작번호, 끝번호 구하기
		Long startNum = (curBlock-1)*perBlock+1;
		Long lastNum = curBlock*perBlock;
		
		System.out.println("시작번호 :" + startNum);
		System.out.println("끝 번호 :" + lastNum);
	}
	
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
