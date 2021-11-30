<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%String proName = "/Sample"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sample/test.jsp</title>
</head>


<body>


<h1>@@@@@샘플 페이지 입니다@@@@@</h1>


<a href="../getBoardList.do">게시판 목록보기(상대경로)</a>
<a href="<%=proName%>/getBoardList.do">게시판 목록보기(절대경로)</a>

<hr>

<img alt="상대경로" src="../resources/imgs/tiger.jpg">
<img alt="절대경로" src="<%=proName%>/resources/imgs/tiger.jpg">


</body>
</html>