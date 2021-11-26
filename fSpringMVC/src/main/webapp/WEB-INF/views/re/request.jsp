<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>re/request.jsp</title>
</head>
<body>


	re/request.do 요청에 의한 뷰페이지 입니다.
	<hr />
	
	
	<h3>파라미터로 데이터 받을 때 </h3>
	아이디 : ${param.id} <br>
	이름 : ${param.name}<br>
	나이 : ${param.age}<br>

	<hr>
	
	<h3>VO객체의 데이터 받을 때 Default 클래스변수 이름으로</h3>
	아이디 : ${memberVO.id} <br>
	이름 : ${memberVO.name}<br>
	나이 : ${memberVO.age}<br>
	
	
	<hr>
	
	<h3>VO객체의 데이터 받을 때 내가정한 클래스변수 이름으로</h3>
	아이디 : ${vo.id} <br>
	이름 : ${vo.name}<br>
	나이 : ${vo.age}<br>
	



</body>
</html>