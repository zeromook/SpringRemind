<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> paramForm.jsp </title>
</head>
<body>

뷰페이지성공
${memberVO.id } : ${memberVO.name} : ${memberVO.age }
<hr/><hr/>

	@@@${sessionScope.name}님 로그인 성공@@@


</body>
</html>