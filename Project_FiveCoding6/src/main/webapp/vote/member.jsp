<%@page import="edu.ict.prj.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
header{
	background-color:steelblue;
	color:white;
	height:70px;
	line-height:70px;
	text-align:center;
}
nav{
	background-color:black;
	color:white;
	height:40px;
	line-height:40px;
	text-align:center;
}
section{
	magin:0;
	background-color:#d3d3d3;
	color:black;
	min-height:550px;
}
footer{
	background-color:black;
	color:white;
	height:50px;
	line-height:50px;
	text-align:center;
	font-size:12px;
}
a:link, a:visited{
	color:white;
	text-decoration:none;
}
button{
	background-color:steelblue;
	color:white;
	width: 80px;
	display: block;
	margin: auto;
}
table{
	width: 100%;
	max-width:800px;
	height: 300px;
	border: 1px solid #dfdfdf;
	border-collapse: collapse;
	box-shadow: 0 0 10px rgba(0,0,0,0.15);
	border-radius: 10px;
	overflow: hidden;
	margin-left:auto; 
	margin-right:auto;

}
tr, td {
	border-bottom: 1px solid #ffffff;
	border-left: 1px solid #ffffff;
	padding: 10px;
	background-color: #f4f4f4;
}
</style>
</head>
<body>

	<header>
		<h1>지역구 의원 투표 프로그램</h1>
	</header>
	
	<nav>
		<a href=member.do>후보조회</a> &emsp; 
		<a href=vote.do>투표하기</a> &emsp;
		<a href=voteList.do>투표검수조회</a> &emsp;
		<a href=memberRank.do>후보자등수</a> &emsp;
		<a href=index.do>홈으로</a>
	</nav>
	
	<section>
		<br>
		<div align=center><h2>지역구 의원 후보 조회</h2></div>

		<table>
			
			<tr align="center">

				<td>후보번호</td>
				<td>성명</td>
				<td>소속정당</td>
				<td>학력</td>
				<td>주민번호</td>
				<td>지역구</td>
				<td>대표번호</td>

			</tr>



			<c:forEach var="member" items="${memberList}">

				<tr align="center">
					<td align="center">${member.m_no}</td>
					<td align="center">${member.m_name}</td>
					<td align="center">${member.p_code}</td>

					<td align="center"><c:choose>
							<c:when test="${member.p_school=='1'}">고졸</c:when>
							<c:when test="${member.p_school=='2'}">학사</c:when>
							<c:when test="${member.p_school=='3'}">석사</c:when>
							<c:otherwise>박사</c:otherwise>
						</c:choose></td>

					<td align="center">${member.m_jumin}</td>
					<td align="center">${member.m_city}</td>
					<td align="center">${member.p_tel}</td>
				</tr>

			</c:forEach>

		</table>
	
		
		<br>
		<button onclick="location.href='index.do'">홈으로</button>
		
	</section>
	
	<footer>
	</footer>	
		
	
	
				
	
</body>
</html>