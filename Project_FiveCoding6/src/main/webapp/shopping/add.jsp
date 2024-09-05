<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
<script
	src="${pageContext.request.contextPath}/resource/js/script_shopping.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/css/style_shopping.css?ver=1">
</head>
<body>
	<%@ include file="topmenu.jsp"%>
	<section>
		<div class="title">홈쇼핑 회원 등록</div>
		<input type="hidden" id="GUBUN" value="insert">
		<div class="wrapper">
			<table cellpadding="0" cellspacing="0" border="1">
				<form action="add.do" method="post">
					<tr>
						<th>회원번호(자동발생)</th>
						<td><input name="custno" value="" readonly value="1"></td>
					</tr>
					<tr>
						<th>회원성명</th>
						<td><input type="text" name="custname"></td>
					</tr>
					<tr>
						<th>회원전화</th>
						<td><input type="text" name="phone"></td>
					</tr>
					<tr>
						<th>회원주소</th>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<th>가입일자</th>
						<td><input type="text" name="joindate"></td>
					</tr>
					<tr>
						<th>고객등급[A:VIP,B:일반,C:직원]</th>
						<td><input type="text" name="grade"></td>
					</tr>
					<tr>
						<th>도시코드</th>
						<td><input type="text" name="city"></td>
					</tr>
					<tr>
						<td colspan="2">
							<button class="btn" type="submit"
								onclick="fn_submit(); return false;">등 록</button>
							<button class="btn" type="button" onclick="location='list.jsp'">조
								회</button>
						</td>
					</tr>
				</form>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>