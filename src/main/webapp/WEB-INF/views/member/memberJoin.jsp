<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>MemberJoin Page</title>
	<style type="text/css">
	input{
		display: block;
		box-sizing: border-box;
		width: 300px;
		height: 30px;
		margin-top: 10px;
	}
	button {
		width: 300px;
		height: 30px;
		margin-top: 10px;
	}
	label:after {
		content: ' *';
		color: red;
	}
	</style>
</head>

<body>
	<h1>MemberJoin Page</h1>
	
	<form action="memberJoin" method="post" enctype="multipart/form-data">
		<label for="id">ID</label>
		<input type="text" name="id" id="id" placeholder="ID입력">
		<label for="pw">PW</label>
		<input type="password" name="pw" id="pw" placeholder="PASSWORD입력">
		<label for="name">NAME</label>
		<input type="text" name="name" id="name" placeholder="NAME입력">
		<label for="email">EMAIL</label>
		<input type="email" name="email" id="email" placeholder="EMAIL입력"> 
		<label for="file">Profile Photo</label>
		<input type="file" name="file" id="file"> 
		<button type="submit">전송</button>
	</form>
	
</body>

</html>