<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert</title>
	<style type="text/css">
	form > *{
		display: block;
	}
	</style>
</head>

<body>

	<h1>${board} Insert Page</h1>
	<form action="./insert" method="post" enctype="multipart/form-data">
		Title : <input type="text" name="title">
		Contents : <textarea rows="10" cols="30" name="contents"></textarea>
		Writer : <input type="text" name="writer">
		
		<input type="file" name="files">
		<input type="file" name="files">
		
		<input type="submit" value="Write">
	</form>

</body>

</html>