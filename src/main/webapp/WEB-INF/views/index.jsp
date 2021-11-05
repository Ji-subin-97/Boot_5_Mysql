<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<h1>Index Page</h1>
	<!-- img 안보임 -->
	<img alt="img1" src="images/snowchees_slider1.jpg">
	<br>
	<a href="./member/memberJoin">회원가입</a>
	<br>
	<a href="./notice/selectList">게시판</a>
</body>

</html>