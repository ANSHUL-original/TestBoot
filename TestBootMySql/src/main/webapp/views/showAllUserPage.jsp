<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Users</title>
</head>
<body>
	<%@include file="header.jsp" %>
	
	<h2>User Details</h2>
	<table>
		<tr>
			<th>User ID</th>
			<th>User name</th>
			<th>Technology</th>		
		</tr>
		<tr>
			<c:forEach var="usr" items="${user}">
				<tr>
					<td>${ usr.uid }</td>
					<td>${ usr.uName }</td>
					<td>${ usr.uTech }</td>
					<td><a href="/updateUser/${ usr.uid }">update</a></td>
					<td><a href="/deleteUser/${ usr.uid }">delete</a></td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	<br>
	<a href="/adduserpage">Add User</a>
</body>
</html>