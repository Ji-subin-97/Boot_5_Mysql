<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>List</title>
	<style type="text/css">
	td{
		padding: 10px;
	}
	</style>
</head>

<body>
	<h1>${board} List Page</h1>
	
	<a href="/notice/selectList">NOTICE</a>
	<a href="/qna/selectList">QnA</a>
	
	<form action="./selectList">
		<select name="kind">
			<option value="title">Title</option>
			<option value="contents">Contents</option>
			<option value="writer">Writer</option>
		</select>
		<input type="text" name="search">
		
		<select name="perPage">
			<option value="5">5개씩 보기</option>
			<option value="10">10개씩 보기</option>
			<option value="20">20개씩 보기</option>
		</select>
		
		<button type="submit">Search</button>
	</form>
	
	<table>
		<thead>
			<tr>
				<th>Num</th><th>Title</th><th>Writer</th><th>Date</th><th>Hit</th>
				<c:if test="${board eq 'qna'}">
					<th>Ref</th><th>Step</th><th>Depth</th>
				</c:if>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${boardList}" var="list">
			<tr>
				<td>${list.num}</td>
				<td><a href="./selectOne?num=${list.num}">${list.title}</a></td>
				<td>${list.writer}</td>
				<td>${list.regDate}</td>
				<td>${list.hit}</td>
				<c:if test="${board eq 'qna'}">
					<td>${list.ref}</td><td>${list.step}</td><td>${list.depth}</td>
				</c:if>	
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="./insert">Write</a>

</body>

</html>