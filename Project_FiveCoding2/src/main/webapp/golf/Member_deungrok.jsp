<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<h2 align="center">회원등록</h2>

		<form id="memberForm" action="MemberDeungrok.golfdo" method="post" onsubmit="return formCheck()">
			<table>

				<tr>
					<td align="center">회원성명</td>
					<td><input type="text" id="memb_name" name="memb_name"></td>
				</tr>
				<tr>
					<td align="center">생년월일</td>
					<td><input type="text" id="birth_date" name="birth_date" placeholder="예시) 20001225"></td>
				</tr>
				<tr>
					<td align="center">성별구분</td>
					<td>
						<select id="sex_g" name=sex_g>
							<option value="" selected disabled>성별 선택</option>
							<option value="1">남</option>
							<option value="2">여</option>
						</select>
					</td>
				</tr>
				<tr>
					<td align="center">전화번호</td>
					<td><input type="text" id="tel_no" name="tel_no"></td>
				</tr>
				<tr>
					<td align="center">거주지</td>
					<td><input type="text" id="juso" name="juso" placeholder="예시) 경기도 일산"></td>
				</tr>
				<tr>
					<td align="center">고객등급</td>
					<td>
						<select id="grade" name=grade>
							<option value="" selected disabled>고객등급 선택</option>
							<option value="1">일반</option>
							<option value="2">VIP</option>
							<option value="3">VVIP</option>
						</select>
					</td>
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