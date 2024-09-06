<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
header {
	background-color: steelblue;
	color: white;
	height: 100px;
	line-height: 70px;
	text-align: center;
}

h1 {
	line-height: 100px;
}

nav {
	background-color: black;
	color: white;
	height: 40px;
	line-height: 40px;
	text-align: center;
}

section {
	magin: 0;
	background-color: #dfdfdf;
	color: black;
	min-height: 550px;
}

footer {
	background-color: black;
	color: white;
	height: 50px;
	line-height: 50px;
	text-align: center;
	font-size: 12px;
}

a:link, a:visited {
	color: white;
	text-decoration: none;
}

button {
	background-color: steelblue;
}

table {
	width: 100%;
	max-width: 500px;
	height: 400px;
	border: 1px solid #dfdfdf;
	border-collapse: collapse;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.15);
	border-radius: 10px;
	overflow: hidden;
	margin-left: auto;
	margin-right: auto;
}

tr, td {
	border-bottom: 1px solid #ffffff;
	border-left: 1px solid #ffffff;
	padding: 10px;
	background-color: #f4f4f4;
}
</style>
<script type="text/javascript">

	function formCheck() {

		//회원성명 확인
		if	(memberForm.memb_name.value == ""){
			alert("회원성명을 입력해주세요");
			memberForm.memb_name.focus();
			return false;
		}
			
		//생년월일 확인 
		if	(memberForm.birth_date.value == ""){
			alert("생년월일을 입력해주세요");
			memberForm.birth_date.focus();
			return false;
		}

		//성별구분 확인
		if(voteForm.sex_g.value == ""){
			alert("성별구분을 선택해주세요");
			memberForm.sex_g.focus();
			return false;
		}

		//전화번호 확인
		if(voteForm.tel_no.value == ""){
			alert("전화번호를 입력해주세요");
			memberForm.tel_no.focus();
			return false;
		}

		//거주지 확인
		if(voteForm.juso.value == ""){
			alert("거주지를 입력해주세요");
			memberForm.juso.focus();
			return false;
		}
		
		//회원등급 확인
		if(voteForm.grade.value == ""){
			alert("회원등급을 선택해주세요");
			memberForm.grade.focus();
			return false;
		}
	}	
	
	
</script>

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
	
	<section>
	<br>
		<h2 align="center">강의 신청</h2>

		<form id="memberForm" action="ReqLecture.golfdo" method="post" onsubmit="return formCheck()">
			<table>

	<%
		int lecture_code =Integer.valueOf(request.getParameter("lecture_code"));
		pageContext.setAttribute("lecture_code", lecture_code);

		String lecture_name = request.getParameter("lecture_name");
		pageContext.setAttribute("lecture_name", lecture_name);

		int lect_grade =Integer.valueOf(request.getParameter("lect_grade"));
		System.out.println("lect_grade ============" + lect_grade);
		pageContext.setAttribute("lect_grade", lect_grade);
		

		String ins_name = request.getParameter("ins_name");
		pageContext.setAttribute("ins_name", ins_name);

		String mozip_st_dt = request.getParameter("mozip_st_dt");
		pageContext.setAttribute("mozip_st_dt", mozip_st_dt);

		String mozip_end_dt = request.getParameter("mozip_end_dt");
		pageContext.setAttribute("mozip_end_dt", mozip_end_dt);

		String lect_place = request.getParameter("lect_place");
		pageContext.setAttribute("lect_place", lect_place);

		String lect_st_dt = request.getParameter("lect_st_dt");
		pageContext.setAttribute("lect_st_dt", lect_st_dt);

		String lect_fee = request.getParameter("lect_fee");
		pageContext.setAttribute("lect_fee", lect_fee);

	%>

<%-- 		<input type="hidden" name="lecture_code" value="${lecture_code}">
		<input type="hidden" name="lecture_name" value="${lecture_name}">
		<input type="hidden" name="lect_grade" value="${lect_grade}">
		<input type="hidden" name="ins_name" value="${ins_name}">
		<input type="hidden" name="mozip_st_dt" value="${mozip_st_dt}">
		<input type="hidden" name="mozip_end_dt" value="${mozip_end_dt}">
		<input type="hidden" name="lect_place" value="${lect_place}">
		<input type="hidden" name="lect_st_dt" value="${lect_st_dt}">
 --%>
		

				<tr>
					<td align="center">강의번호</td>
					<td><input type="text" id="lecture_code" name="lecture_code"  value = <%=lecture_code%> ></td>
				</tr>
				<tr>
					<td align="center">강의명</td>
					<td><input type="text" id="lecture_name" name="lecture_name" value = <%=lecture_name%> ></td>
				</tr>
				
				<tr>
					<td align="center">강의등급</td>
					<td>
						<c:choose>
						<c:when test="${lect_grade == 1}"><input type="text" id="lect_grade" name="lect_grade" value="초급"></c:when>
						<c:when test="${lect_grade == 2}"><input type="text" id="lect_grade" name="lect_grade" value="중급"></c:when>
						<c:when test="${lect_grade == 3}"><input type="text" id="lect_grade" name="lect_grade" value="고급"></c:when>
						<c:otherwise>${lect_grade} </c:otherwise>
						</c:choose>
					</td>
				</tr>
				<tr>
					<td align="center">강사명</td>
					<td><input type="text" id="ins_name" name="ins_name" value = <%=ins_name%> ></td>
				</tr>
				<tr>
					<td align="center">모집시작일</td>
					<td><input type="text" id="mozip_st_dt" name="mozip_st_dt" value = <%=mozip_st_dt%> ></td>
				</tr>
				<tr>
					<td align="center">모집종료일</td>
					<td><input type="text" id="mozip_end_dt" name="mozip_end_dt" value = <%=mozip_end_dt%> ></td>
				</tr>
				<tr>
					<td align="center">강의장소</td>
					<td><input type="text" id="lect_place" name="lect_place" value = <%=lect_place%> ></td>
				</tr>
				<tr>
					<td align="center">강의시작일</td>
					<td><input type="text" id="lect_st_dt" name="lect_st_dt" value = <%=lect_st_dt%> ></td>
				</tr>
				<tr>
					<td align="center">수강료</td>
					<td><input type="text" id="lect_fee" name="lect_fee" value = <%=lect_fee%> ></td>
				</tr>
				
				<tr>
					<td align="center">회원번호</td>
					<td><input type="text" id="memb_code" name="memb_code"  ></td>
				</tr>


				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="등록하기">
						<input type="reset" value="지우기">
					</td>

				</tr>

			</table>
		</form>

	</section>
	
	<footer>
	</footer>


</body>
</html>