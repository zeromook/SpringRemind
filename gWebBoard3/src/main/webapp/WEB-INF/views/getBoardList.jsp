<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ���</title>
</head>
<body>
		<h1>�Խñ� ���</h1>
		
	<table border="1">
			<tr>
				<th bgcolor="orange" width="100">��ȣ</th>
				<th bgcolor="orange" width="200">����</th>
				<th bgcolor="orange" width="150">�ۼ���</th>
				<th bgcolor="orange" width="150">�����</th>
				<th bgcolor="orange" width="100">��ȸ��</th>
				<!-- �߰� -->
				<th bgcolor="orange" width="150">�����̸�</th>
				<th bgcolor="orange" width="100">���Ͽ뷮</th>				
			</tr>
			<c:forEach items="${boardList }" var="board">
				<!-- ������Ƽ�̸� ���� -->
				<tr>
					<td>${board.b_id }</td>
					<td align="left"><a href="getBoard?b_id=${board.b_id }">
							${board.b_title }</a></td>
					<td>${board.b_name }</td>
					<td>${board.b_date }</td>
					<td>${board.b_count }</td>
					<!-- �߰� -->
					<td>
					 <c:choose>
					    <c:when test="${board.b_fsize==0}">÷������ ����</c:when>
					    <c:otherwise>
					    		<img src="resources/images/disk.gif">${board.b_fname}
					    </c:otherwise>
					 </c:choose>					  
					</td>					
					<td>${board.b_fsize}byte</td>
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertBoard">���� ���</a>
</body>
</html>