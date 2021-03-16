<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<table>
	
		<tr>
			<c:forEach var="emplist" items="${ empList }">
				<td>
					${ emplist}
				</td>
			</c:forEach>
		</tr>
	</table>

</body>
</html>