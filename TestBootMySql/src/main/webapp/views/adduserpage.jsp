<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<form action="addUser" method="post">
		<label>User Name: </label>
		<input type="text" name="uName"><br>
		<label>Technology: </label>
		<input type="text" name="utech"><br>
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>