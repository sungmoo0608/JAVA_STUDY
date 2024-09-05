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
				<%
				for (int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td><a href="modify?custno=<%=list.get(i).getCustno()%>">
					<%=list.get(i).getCustno()%></a></td>
					<td><%=list.get(i).getCustname()%></td>
					<td><%=list.get(i).getPhone()%></td>
					<td><%=list.get(i).getAddress()%></td>
					<td><%=list.get(i).getJoindate()%></td>
					<td><%=list.get(i).getGrade()%></td>
					<td><%=list.get(i).getCity()%></td>
					<td><a href="delete?custno=<%=list.get(i).getCustno()%>">
					Delete</a></td>
				</tr>
				<%}%>
			</table>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
</html>