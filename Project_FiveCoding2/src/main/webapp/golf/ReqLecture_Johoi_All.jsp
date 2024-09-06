<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="edu.ict.prj.vo.InfoInstructorVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<style type="text/css">
header{
	background-color:steelblue;
	color:white;
	height:100px;
	line-height:70px;
	text-align:center;
}

h1 {
	line-height: 100px;
}

exebtn{
	text-align:center;
	margin: auto;
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
	min-height:100px;
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
	max-width:1300px;
	height: 50px;
	border: 1px solid #dfdfdf;
	border-collapse: collapse;
	box-shadow: 0 0 10px rgba(0,0,0,0.15);
	border-radius: 5px;
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
		<h1>성수골프연습장 관리시스템</h1>
	</header>
	
	<nav>
		<a href=Lecture_Johoi_All.jsp>강의현황조회</a> &emsp;
		<a href=Instructor_Johoi_All.jsp>강사진 조회</a> &emsp;
		<a href=Member_Johoi_All.jsp>회원조회</a> &emsp;
		<a href=Member_deungrok.jsp>회원등록</a> &emsp;
		<a href=Instructor_Deungrok.jsp>강사등록</a> &emsp;
		<a href="${pageContext.request.contextPath}/index.jsp">프로젝트 홈으로</a>
	</nav>

   <form action="ReqLectureJohoiAll.golfdo" method="post">
	
	<section>
		<br>
		<div align=center><h2>강의신청 내역조회</h2></div>

	<%
		int lecture_code =Integer.valueOf(request.getParameter("lecture_code"));
		pageContext.setAttribute("lecture_code", lecture_code);
	%>

		<input type="hidden" name="lecture_code" value="${lecture_code}">
		
		<div class="text-center mt-3 mb-3">
			<div class="text-center" >
				<span>강의코드</span>
				<input type="text" id="v_lecture_code"  name="v_lecture_code" value = <%=lecture_code%>>
				
			</div>
		</div>


		<table>
			<tr align="center">

				<td>NO</td>
				<td>강의코드</td>
				<td>신청번호</td>
				<td>강의명</td>
				<td>강의등급</td>
				<td>강사명</td>
				<td>고객코드</td>
				<td>고객명</td>
				<td>고객등급</td>

			</tr>
			<c:forEach var="rslt" items="${ReqLectureList}">

				<tr align="center">
					<td align="center">${rslt.seqno} </td>	
					<td align="center">${rslt.lecture_code}</td>
					<td align="center">${rslt.seq_no}</td>
					<td align="center">${rslt.lecture_name}</td>
					<td align="center">
					<c:choose>
						<c:when test="${rslt.lect_grade =='1'}">초급</c:when>
						<c:when test="${rslt.lect_grade =='2'}">중급</c:when>
						<c:when test="${rslt.lect_grade =='3'}">고급</c:when>
						<c:otherwise>${rslt.lect_grade} </c:otherwise>
					</c:choose></td>
					<td align="center">${rslt.ins_name}</td>
					<td align="center">${rslt.memb_code}</td>
					<td align="center">${rslt.memb_name}</td>
					<td align="center">
					<c:choose>
						<c:when test="${rslt.grade =='1'}">일반</c:when>
						<c:when test="${rslt.grade =='2'}">VIP</c:when>
						<c:when test="${rslt.grade =='3'}">VVIP</c:when>
						<c:otherwise>${rslt.grade} </c:otherwise>
					</c:choose></td>
				</tr>

			</c:forEach>

		</table>
		
		<br>
		<div class="text-center mt-3 mb-5">
			<div class="text-center" >
					<input type="submit" value="조회하기">
					<input type="reset" value="강의코드 초기화">
			</div>
		</div>
		<br>

	</section>
	</form>
	
	<footer>
	</footer>	
	         
		
	
	
				
	
</body>
</html>