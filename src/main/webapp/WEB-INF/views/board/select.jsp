<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Select</title>
	<style type="text/css">

	</style>
</head>

<body>

	<h1>${board} Select Page</h1>
	
	<h3>Title : ${boardVO.title}</h3>
	<h3>Writer : ${boardVO.writer}</h3>
	<h3>Contents : ${boardVO.contents}</h3>
	
	<a href="./update?num=${boardVO.num}">Update</a>
	<a href="./delete?num=${boardVO.num}">Delete</a>
	
</body>

</html>