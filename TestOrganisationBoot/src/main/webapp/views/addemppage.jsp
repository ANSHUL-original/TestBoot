<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<form action="addEmp" method="post">
		Employee name: <input type="text" name="empName"><br>
		Employee Phone NUmber: <input type="text" name="empPhone"><br>
		Employee joining data: <input type="date" name="joining"><br>
		Employee current Organization Name: <input type="text" name="oName"><br>
		<input type="submit" value="submit">
	</form>

</body>
</html>