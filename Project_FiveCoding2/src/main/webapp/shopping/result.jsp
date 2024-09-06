<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="edu.ict.prj.vo.ShoppingMoneyVO"%>
<%
request.setCharacterEncoding("UTF-8");
ArrayList<ShoppingMoneyVO> list = new ArrayList<ShoppingMoneyVO>();
list = (ArrayList<ShoppingMoneyVO>) request.getAttribute("list");
%>
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
</head>
<body>
	<%@ include file="topmenu.jsp"%>

	<section>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center my-5">
					<h2 class="heading-section">회원 매출 조회</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-12 text-center">
					<div class="table-wrap">
						<table class="table table-striped">
							<tr>
								<th>회원번호</th>
								<th>회원성명</th>
								<th>고객등급</th>
								<th>매출</th>
							</tr>
							<%
							for (int i = 0; i < list.size(); i++) {
							%>
							<tr>
								<td><%=list.get(i).getCustno()%></td>
								<td><%=list.get(i).getCustname()%></td>
								<td><%=list.get(i).getGrade()%></td>
								<td><%=list.get(i).getPrice()%></td>
							</tr>
							<%}%>
						</table>
					</div>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col text-center mb-5">
					<div>
						<a href="add" class="btn btn-warning">회원 등록</a>
						<a href="list" class="btn btn-info">회원 조회</a>
						<a href="home" class="btn btn-dark">회원 관리 홈으로</a>
					</div>
				</div>
			</div>
		</div>

	</section>
	<%@ include file="footer.jsp"%>

	<script
		src="${pageContext.request.contextPath}/resource/js/jquery-1.11.0.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/js/plugins.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/js/script.js"></script>
</body>
</html>