<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>MemberLogin Page</title>
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
	<h1>MemberLogin Page</h1>
	
	<form action="memberLogin" method="post" enctype="multipart/form-data">
	
		<label for="id">ID</label>
		<input type="text" name="id" id="id" placeholder="ID입력">
		<label for="pw">PW</label>
		<input type="password" name="pw" id="pw" placeholder="PASSWORD입력">

		<button type="submit">로그인</button>
		
	</form>
	
</body>

</html>