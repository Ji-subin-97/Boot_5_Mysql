<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>MemberList Page</title>
	<style type="text/css">
	table td{
		border: 1px solid black;
	}
	</style>
</head>
<body>
	<h1>MemberList Page</h1>
	<table>
		<thead>
			<tr>
				<th>아이디</th><th>비밀번호</th><th>이름</th><th>이메일</th><th>이미지</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${memberList}" var="ListVO">
			<tr>
				<td>${ListVO.id}</td>
				<td>${ListVO.pw}</td>
				<td>${ListVO.name}</td>
				<td>${ListVO.email}</td>
				<td>
					<c:forEach items="${ListVO.memberFileList}" var="fileVO">
						<img alt="img" src="../upload/member/${ListVO.id}/${fileVO.fileName}">
					</c:forEach>		
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>