<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body>

	<h2>한 줄 게시판 글 목록</h2>
	<hr>
	<table width="500" cellpadding="0" cellspacing="0" border="1"> 
	
		<tr bgcolor="yellow" align="center">
			<td align="center">번호</td>
			<td align="center">글쓴이</td>
			<td align="center">내용</td>
			<td align="center">삭제</td>
		</tr>
		<c:forEach items="${list }" var="dto">
		<tr>
			<td align="center">${dto.mid }</td>
			<td align="center">${dto.mwriter }</td>
			<td>${dto.mcontent }</td>
			<td align="center"><a href="delete?mid=${dto.mid}">X</a></td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="4" align="right">
				<input type="button" value="글쓰기" onclick="location.href='writeForm'">
			</td>
		</tr>
		
	</table>
	
</body>
</html>