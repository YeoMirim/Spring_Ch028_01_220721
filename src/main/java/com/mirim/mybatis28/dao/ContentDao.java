package com.mirim.mybatis28.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.mirim.mybatis28.dto.ContentDto;

public class ContentDao implements IDao {  // 상속받음, 사용해야할 의무발생 => 오버라이딩

	JdbcTemplate template;

	@Autowired		// Bean에서 가지고있는 내용 자동주입 설정
	public void setTemplate(JdbcTemplate template) { // 컨테이너에서 주입받음
		this.template = template;
	}

	public ContentDao() {
		super();
		// TODO Auto-generated constructor stub
	}	// 생성자

	
	@Override
	public ArrayList<ContentDto> listDao() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM simple_board ORDER BY mid DESC";		// 내림차순 정렬
		
		ArrayList<ContentDto> dtos = (ArrayList<ContentDto>) template.query(sql, new BeanPropertyRowMapper<ContentDto>(ContentDto.class)); // 선언 
		
		return dtos;
	}

	@Override
	public void writeDao(final String mwriter, final String mcontent) {
		// TODO Auto-generated method stub
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				
				String sql = "INSERT INTO simple_board (mid, mwriter, mcontent) VALUES (simple_board_seq.nextval, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, mwriter);
				pstmt.setString(2, mcontent);	// 값이 변경되지 못하게 final 설정
				
				
				
				return pstmt;
			}
		});
	}

	@Override
	public void deleteDao(final String mid) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM simple_board WHERE mid=?";
		
		this.template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				pstmt.setInt(1, Integer.parseInt(mid));
			}
			
		});
	}


}
