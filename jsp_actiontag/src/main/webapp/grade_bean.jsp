<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>bean 연습 입니다.</h1>
	
	<jsp:useBean id="grade" class="edu.ict.bean.Grade"/>
	
	<jsp:setProperty name="grade" property="name" value="홍길동" />
	<jsp:setProperty name="grade" property="kor" value="80" />
	<jsp:setProperty name="grade" property="eng" value="85" />
	<jsp:setProperty name="grade" property="math" value="70" />

	이름 : <jsp:getProperty name="grade" property="name" /><br>
	국어 : <jsp:getProperty name="grade" property="kor" /><br>
	영어 : <jsp:getProperty name="grade" property="eng" /><br>
	수학 : <jsp:getProperty name="grade" property="math" /><br>
	총점 : <jsp:getProperty name="grade" property="sum" /><br>
	평균 : <jsp:getProperty name="grade" property="avg" /><br>
	성적 : <jsp:getProperty name="grade" property="grade" /> 입니다.<br>
	
</body>
</html>