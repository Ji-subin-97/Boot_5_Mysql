<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Update</title>
	<style type="text/css">
	form > *{
		display: block;
	}
	</style>
</head>

<body>

	<h1>${board} Update Page</h1>
	<form action="./update" method="post">
		<input type="hidden" name="num" value="${boardVO.num}">
		Title : <input type="text" name="title" value="${boardVO.title}">
		Contents : <textarea rows="10" cols="30" name="contents">${boardVO.contents}</textarea>
		Writer : <input type="text" name="writer" value="${boardVO.writer}" readonly="readonly">
		<input type="submit" value="Update">
	</form>
	
</body>

</html>