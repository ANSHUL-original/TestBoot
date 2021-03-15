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
	<table>
	<tr>
		<th>User id</th>
		<th>User Name</th>
		<th>Technology</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<tr>
		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.uid}</td>
				<td>${user.uName}</td>
				<td>${user.uTech}</td>
				<td><a href="updateuser/${user.uid}">update</a></td>
				<td><a href="deleteuser/${user.uid}">delete</a></td>
			<tr>		
		</c:forEach>
	</tr>
	</table>
	<a href="/adduserpage">add user</a>

</body>
</html>