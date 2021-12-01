<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
	$(function(){
		$("#img").click(function(){
			alert("해당 사진이 다운됩니다.")
		})
	})
</script>
<body>
		<h1>글 상세</h1>		
		<hr>
		<form action="updateBoard" method="post">
			<input name="b_id" type="hidden" value="${board.b_id}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input name="b_title" type="text"
						value="${board.b_title }" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left">${board.b_name }</td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea name="b_content" cols="40" rows="10">${board.b_content }</textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left">${board.b_date }</td>
				</tr>
				<tr>
					<td bgcolor="orange">조회수</td>
					<td align="left">${board.b_count }</td>
				</tr>
				<!-- #### 첨부파일을 보여주고자 한다면 -->
				<c:if test="${board.b_realfname != null }">
					<tr>
						<td colspan="2" align="center" >
							<a download="${board.b_fname}" href="/gWebBoard2/resources/upload/${board.b_realfname}">
								<img id="img" alt="클릭하면 다운됩니다." src="/gWebBoard2/resources/upload/${board.b_realfname}" width="500" height="400">
							</a>
						</td>
					</tr>
				</c:if>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="글 수정" /></td>
				</tr>
				
				
			</table>
		</form>
		<hr>
		<a href="insertBoard">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteBoard?b_id=${board.b_id }">글삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getBoardList">글목록</a>
</body>
</html>
