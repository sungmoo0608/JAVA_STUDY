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
</head>
<body>
	<%@ include file="topmenu.jsp"%>
	<section>
		<div class="title">쇼핑몰 회원관리 프로그램</div>
		<div class="wrapper">
			<table style="width: 900px">
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
				<c:forEach var="shoppingMember" items="${shoppingList}">
					<tr>
						<td>${shoppingMember.custno}</td>
						<td>${shoppingMember.custname}</td>
						<td>${shoppingMember.phone}</td>
						<td>${shoppingMember.address}</td>
						<td>${shoppingMember.joindate}</td>
						<td>${shoppingMember.grade}</td>
						<td>${shoppingMember.city}</td>
						<td>삭제</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>