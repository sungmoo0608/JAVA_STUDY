<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul {
		margin-top: 0;
		margin-bottom: 0;
	}
	
	a {
		color: #ffffff;
		text-decoration: none;
	}
	
	a:hover {
		color: red;
		text-decoration: underline;
	}
</style>
</head>
<body>
	<header>쇼핑몰 회원관리</header>
	<nav>
		<ul>
			<li><a href="${pageContext.request.contextPath}/index.jsp">프로젝트
					홈으로</a></li>
			<li><a href="home">회원관리 홈</a></li>
			<li><a href="add">회원등록</a></li>
			<li><a href="list">회원목록조회/수정</a></li>
			<li><a href="result">회원매출조회</a></li>
		</ul>
	</nav>
</body>
</html>