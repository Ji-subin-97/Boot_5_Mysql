<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>List</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<style type="text/css">
	td{
		padding: 10px;
	}
	a{
		text-decoration: none;
		color: black;
	}
	</style>
</head>

<body>
	<h1>${board} List Page</h1>
	
	<a href="/notice/selectList">NOTICE</a>
	<a href="/qna/selectList">QnA</a>
	
	<form action="./selectList">
		<select name="kind" id="kindSelect">
			<option value="title">Title</option>
			<option value="contents">Contents</option>
			<option value="writer">Writer</option>
		</select>
		<input type="text" name="search" id="search">
		
	<!-- 	<select name="perPage">
			<option value="5">5개씩 보기</option>
			<option value="10">10개씩 보기</option>
			<option value="20">20개씩 보기</option>
		</select> -->
		
		<button type="button" id="btn">Search</button>
	</form>
	
	<table>
		<thead>
			<tr>
				<th>Num</th><th>Title</th><th>Writer</th><th>Date</th><th>Hit</th>
				<c:if test="${board eq 'qna'}">
					<th>Ref</th><th>Step</th><th>Depth</th><th></th>
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
					<td><a href="./reply">답글달기</a></td>
				</c:if>	
			</tr>
			</c:forEach>
		</tbody>
	</table>
	

	<!-- Paging Start -->
	
	<a href="./selectList?pn=${pager.startNum - 1}&kind=${pager.kind}&search=${pager.search}">&lt;</a>
	
	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="n">
		<a href="./selectList?pn=${n}&kind=${pager.kind}&search=${pager.search}">${n}</a>
	</c:forEach>
	
	<c:if test="${not pager.lastCheck}">
		<a href="./selectList?pn=${pager.lastNum + 1}&kind=${pager.kind}&search=${pager.search}">&gt;</a>
	</c:if>
	<br>
	
	<!-- Paging Finish -->
	
	<a href="./insert">Write</a>
	
	<script type="text/javascript">
	
	$("#btn").click(function () {
		$('form').submit();
	});
	
	let kind = '${pager.kind}';
	let search = '${pager.search}';
	let pn = ${pager.pn};
	
	$("#kindSelect").val(kind).prop('selected', true);
	$("#search").val(search);
	
	console.log(kind, search, pn);
	
	</script>
	
</body>

</html>