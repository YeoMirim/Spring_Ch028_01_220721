package com.mirim.mybatis28.dao;

import java.util.ArrayList;

import com.mirim.mybatis28.dto.ContentDto;

public interface IDao {
	
	// 추상메소드, 이름만 생성, 접근지정자는 써도 안써도 그만
	public ArrayList<ContentDto> listDao();		// 리스트 불러오기
	public void writeDao(String mwriter, String mcontent);  // 사용자가 입력한 내용으로 글 쓰기
	public void deleteDao(String mid);	// 글 삭제
}
