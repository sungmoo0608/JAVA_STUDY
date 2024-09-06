<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/css/style_shopping.css?ver=1">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/bootstrap.min.css">
<%-- <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/style.css"> --%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/resource/js/modernizr.js"></script>
<style>
</style>
</head>
<body>
	<%@ include file="topmenu.jsp"%>
	<section>

		<div class="title">쇼핑몰 회원관리 프로그램</div>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6">
					<p>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.</p>
					<p>프로그램 작성 순서</p>
					<ul>
						<li>회원정보 테이블을 생성한다.</li>
						<li>회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.</li>
						<li>회원정보 입력 하면프로그램을 작성한다.</li>
						<li>회원정보 조회 프로그램을 작성한다.</li>
						<li>회원매출정보 조회 프로그램을 작성한다.</li>
					</ul>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center my-5">
					<a href="add" class="btn btn-warning">회원 등록</a> 
					<a href="list" class="btn btn-info">회원 조회</a>
				</div>
			</div>
		</div>

	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>