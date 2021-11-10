<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	
	<form:form modelAttribute="memberVO" enctype="multipart/form-data">
		
		<label for="id">ID</label>
		<form:errors path="id" cssStyle="color:red"></form:errors>
		<form:input path="id" id="id"/>
		
		<label for="pw">Pw</label>
		<form:errors path="pw" cssStyle="color:red"></form:errors>
		<form:password path="pw" id="pw"/>
		
		<label for="pwCheck">PwCheck</label>
		<form:errors path="pwCheck" cssStyle="color:red"></form:errors>
		<form:password path="pwCheck" id="pwCheck"/>
		
		<label for="name">Name</label>
		<form:errors path="name" cssStyle="color:red"></form:errors>
		<form:input path="name" id="name"/>
		
		<label for="email">Email</label>
		<form:errors path="email" cssStyle="color:red"></form:errors>
		<form:input path="email" id="email"/>
		
		<label for="age">Age</label>
		<form:errors path="age" cssStyle="color:red"></form:errors>
		<form:input path="age" id="age"/>
		
		<label for="birth">Birth</label>
		<form:errors path="birth" cssStyle="color:red"></form:errors>
		<form:input path="birth" id="birth"/>
		
		<label for="file">Profile Photo</label>
		<input type="file" name="file" id="file">
		
		<button type="submit">회원가입</button>
		
	</form:form>
	
	<%-- 
	<form action="memberJoin" method="post" enctype="multipart/form-data">
	
		<label for="id">ID</label>
		<input type="text" name="id" id="id" placeholder="ID입력">
		<label for="pw">PW</label>
		<input type="password" name="pw" id="pw" placeholder="PASSWORD입력">
		<label for="pwCheck">PWCheck</label>
		<input type="password" name="pwCheck" id="pwCheck" placeholder="PASSWORD 확인">
		<label for="name">NAME</label>
		<input type="text" name="name" id="name" placeholder="NAME입력">
		<label for="email">EMAIL</label>
		<input type="email" name="email" id="email" placeholder="EMAIL입력"> 
		<label for="file">Profile Photo</label>
		<input type="file" name="file" id="file"> 
		
		<button type="submit">전송</button>
		
	</form> --%>
	
</body>

</html>