<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="edu.ict.prj.vo.ShoppingMemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%

/* String site = request.getAttribute("삭제");

if(site != null){
	out.print("<script> alert('회원삭제가 완료 되었습니다!')</script>");
} */

request.setCharacterEncoding("UTF-8");
ArrayList<ShoppingMemberVO> list = new ArrayList<ShoppingMemberVO>();

list = (ArrayList<ShoppingMemberVO>) request.getAttribute("list");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/style_shopping.css?ver=1">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/bootstrap.min.css">

<%-- <link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/style.css"> --%>
	
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Jost:wght@300;400;500&family=Lato:wght@300;400;700&display=swap" rel="stylesheet">
<script src="${pageContext.request.contextPath}/resource/js/modernizr.js"></script>
	
</head>
<body>
	<%@ include file="topmenu.jsp"%>
	<section>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col text-center my-5">
					<h2 class="heading-section">쇼핑몰 회원 목록 조회</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col text-center">
					<div class="table-wrap">
						<table class="table table-striped">
							<tr>
								<th>회원번호</th>
								<th>회원성명</th>
								<th>전화번호</th>
								<th>주소</th>
								<th>가입일자</th>
								<th>고객등급</th>
								<th>거주지역</th>
								<th>삭제</th>
							</tr>
							<%
							for (int i = 0; i < list.size(); i++) {
							%>
							<tr>
								<td><a href="modify?custno=<%=list.get(i).getCustno()%>"
									class="btn btn-success"><%=list.get(i).getCustno()%></a></td>
								<td><%=list.get(i).getCustname()%></td>
								<td><%=list.get(i).getPhone()%></td>
								<td><%=list.get(i).getAddress()%></td>
								<td><%=list.get(i).getJoindate()%></td>
								<td><%=list.get(i).getGrade()%></td>
								<td><%=list.get(i).getCity()%></td>
								<td><a href="delete?custno=<%=list.get(i).getCustno()%>"
									class="btn btn-danger">Delete</a></td>
							</tr>
							<%
							}
							%>
						</table>
					</div>
				</div>
				<div class="row justify-content-center">
					<div class="col-md-6 text-center mb-5">
						<a href="add" class="btn btn-warning">회원 등록</a>
						<a href="home" class="btn btn-dark">회원 관리 홈으로</a>
					</div>
				</div>
			</div>

		</div>
	</section>
	<%@ include file="footer.jsp"%>
<%-- 
	<script
		src="${pageContext.request.contextPath}/resource/js/jquery-1.11.0.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/swiper/swiper-bundle.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/js/plugins.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resource/js/script.js"></script> --%>
</body>
</html>