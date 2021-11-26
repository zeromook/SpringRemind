<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>views / userListResult</title>
</head>
<body>
	
	<h3>Member List</h3>


	<table border='2'>
		<tr>
			<td>이름</td>
			<td>아이디</td>
			<td>나이</td>
		</tr>
		<c:forEach var='vo' items="${memberVOList.list}" >
			<c:if test="${vo.state}">
				<tr>        
					<td>${vo.name}</td>
					<td>${vo.id}</td>
					<td>${vo.age}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>



</body>
</html>