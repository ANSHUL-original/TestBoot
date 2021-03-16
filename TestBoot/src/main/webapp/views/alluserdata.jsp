<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<%@ include file="header.jsp" %>

	<form action="filterTechnology" method="post">
		<label> technology </label>
		<select name="uTech">
			<option value = "java" > java </option>
			<option value = "python"> python </option>
			<option value = "javascript" > javascript </option>
			<option value = "c++" > c++ </option>
		</select>
		 <label>User Name	</label>
		<select name="uName">
			<c:forEach var="namelist" items="${ namelist }">
				<option value="${ namelist }">${ namelist }</option>
			</c:forEach>
		</select>
		<input type="submit" value="submit">
	</form>

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
	<a href="/adduserpage">add user</a><br>
	<a href="/">Home</a>

</body>
</html>