<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>

<head>

	<meta charset="UTF-8">
	<title>Index Page</title>
	<link rel="stylesheet" href="css/test.css">
	
	<script type="text/javascript">
	
	function getParameterByName(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	}
	
	let result = parseInt(getParameterByName('result'));
	
	if(result == 1){
		alert("회원가입 완료!");
	}
	
	</script>
	
</head>

<body>
	<h1>Index Page
		<spring:message code="hello.hi"></spring:message>
	</h1>
	<c:if test="${not empty member}">
		<h3>${member} 님		
			<spring:message code="hello" text="Default Message"></spring:message>	
		</h3>
		<h3>
			<spring:message code="member.info" arguments="${member}-${member}" argumentSeparator="-"></spring:message>
		</h3>
	</c:if>
	<br>
	<!-- img 안보임 -->
	<img alt="img1" src="images/snowchees_slider1.jpg">
	<br>
	<a href="./member/memberJoin">회원가입</a>
	<br>
	<c:choose>
		<c:when test="${not empty member}">
			<a href="./member/memberLogOut">로그아웃</a>
		</c:when>
		<c:otherwise>
			<a href="./member/memberLogin">로그인</a>
		</c:otherwise>
	</c:choose>
	<br>
	<a href="./notice/selectList">게시판</a>
</body>

</html>