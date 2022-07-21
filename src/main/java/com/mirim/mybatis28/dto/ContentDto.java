package com.mirim.mybatis28.dto;

public class ContentDto {
	
	private int mid;			// 글 번호
	private String mwriter;		// 글쓴이
	private String mcontent;	// 한줄 글 내용
	
	
	public ContentDto() {					
		super();
		// TODO Auto-generated constructor stub
	}	// 생성자


	public ContentDto(int mid, String mwriter, String mcontent) {
		super();
		this.mid = mid;
		this.mwriter = mwriter;
		this.mcontent = mcontent;
	}	// 필드를 이용한 생성자


//	[getter, setter 생성]	
	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMwriter() {
		return mwriter;
	}


	public void setMwriter(String mwriter) {
		this.mwriter = mwriter;
	}


	public String getMcontent() {
		return mcontent;
	}


	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	
	
	
	
}
