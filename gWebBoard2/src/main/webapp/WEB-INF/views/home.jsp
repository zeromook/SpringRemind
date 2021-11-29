<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html; charset=UTF-8"%>
<%@ page session="false" %>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script>
	$(function(){
		
		$("h1").click(function(){
			$(this).css("font-size","50px")
		})
	
		
		
		
	})

</script>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<b> 입력을 성공했습니다!!!!!!!!!!!!!!!!!!축하드립니당</b>
</body>
</html>
