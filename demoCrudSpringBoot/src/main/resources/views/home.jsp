<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<h4>Login</h4><br>
	<form:form action="login" method="post" modelAttribute="userBeans">
		<label>user Name: </label>
		<form:input type="text" path="userName"/><br>
		<label>Password: </label>
		<form:input type="password" path="password"/><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>