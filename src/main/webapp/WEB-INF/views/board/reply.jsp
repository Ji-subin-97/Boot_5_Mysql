<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

	<h1>${board} Reply Page</h1>
	
	<form:form modelAttribute="boardVO" enctype="multipart/form-data">
		<form:hidden path="num"/>
		<div>
			<label for="title">Title</label><br>
			<form:input path="title" id="title"/>
			<form:errors path="title"></form:errors>
		</div>
		<div>
			<label for="writer">Writer</label><br>
			<form:input path="writer" id="writer"/>
		</div>
		<div>
			<label for="contents">Contents</label><br>
			<form:textarea path="contents" id="contents"/>
		</div>
		<div>
			<label for="file">File</label><br>
			<input type="file" name="files" id="file">
			<input type="file" name="files">
		</div>
		<div>
			<button type="submit">Update</button>
		</div>
	</form:form>
		
	
	<%-- <form action="./insert" method="post" enctype="multipart/form-data">
		Title : <input type="text" name="title">
		Contents : <textarea rows="10" cols="30" name="contents"></textarea>
		Writer : <input type="text" name="writer">
		
		<input type="file" name="files">
		<input type="file" name="files">
		
		<input type="submit" value="Write">
	</form> --%>

</body>

</html>