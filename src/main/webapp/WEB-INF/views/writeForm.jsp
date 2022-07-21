<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한 줄 글쓰기</title>
</head>
<body>
	<h2> 한 줄 글쓰기 </h2>
	<hr>
	<table width="500" cellspacing="0" cellpadding="0" border="1">
		<form action="write">
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="mwriter" size="50"></td>
			</tr>
			<tr>
				<td>한줄쓰기</td>
				<td><input type="text" name="mcontent" size="50"></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="글입력">
					<input type="button" value="글목록" onclick="location.href='list'">
				</td>
			</tr>
		
		</form>
	</table>
</body>
</html>