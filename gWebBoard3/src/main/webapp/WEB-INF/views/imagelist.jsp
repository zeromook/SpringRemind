<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IMG LIST</title>
</head>
<body>
<!--  이미지 파일 첨부를 한 레코드를 5개정도 입력-->

<!--	이페이지에 3개씩로 이미지들만 출력하기-->

		<table>
				<tr>
					<c:set var="cnt" value="0" />
					<c:forEach items="${ImgList}" var="board">
						<c:if test="${board.b_realfname != null}">
							<td>
								<a href="getBoard?b_id=${board.b_id }">
									<img src="/gWebBoard2/resources/upload/${board.b_realfname}" />
									${board.b_title}
									<c:set var="cnt" value="${cnt+1}"/>
									<c:if test="${cnt % 3 == 0}">
										<tr></tr>
									</c:if>
								</a>
							</td>
						</c:if>
					</c:forEach>
				</tr>
		</table>
	
<!--	해당 이미지를 클릭하면 getBoard로 이동하기 -->
	
	
	


</body>
</html>