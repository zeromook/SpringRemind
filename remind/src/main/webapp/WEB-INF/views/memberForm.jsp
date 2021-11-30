<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> 폼 예제 1 </title>
</head>
<body>

<h2>회원가입</h2>
<form name="frm" id='frm' method="post" action="insertMember.do" >
		<label for="id">아이디</label>
		<input type="text" id="id" name="userid" required> 
		<br>
		<label for="password">비밀번호</label>
		<input type='password' id="password" name="userpass" > 
		<br>
		<label for="name">이름</label>
		<input type="text" id="name" name="username" required> 
		<br><br/>
		<!--2.  체크사항 -->
		<label for='agree'>약관을 읽었습니다.</label>
		<input type="checkbox" id="agree" > 네, 확인하였습니다.
		<br/><br/><br/>
	<input type="submit" value="회원가입"> 

</form>
</body>
</html>