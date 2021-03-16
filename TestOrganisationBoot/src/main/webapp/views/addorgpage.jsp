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
	<form action="addOrg">
		<label>Organization Name: </label>
		<input type="text" name="oName"><br>
		<input type="submit" value="submit">		
	</form>

</body>
</html>