<%@page import="java.util.List"%>
<%@page import="edu.ict.prj.dao.EmpDao"%>
<%@page import="edu.ict.prj.vo.EmpVO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Emp 페이지</h1>
	<%
	
		EmpDao dao = new EmpDao();

		List<EmpVO> empList = dao.empSelect();
		
		pageContext.setAttribute("empList", empList);
	
	%>
	
	<c:forEach var="emp" items="${empList}">
		사원번호 : ${emp.getEmpno()} | 사원이름 : ${emp.getEname()} | 직업 : ${emp.getJob()} | 매니저 : ${emp.getMgr()} | 
		입사일 : ${emp.getHiredate()} | 급여 : ${emp.getSal()} | 커미션 : ${emp.getComm()} | 부서번호 : ${emp.getDeptno()}<br>
	</c:forEach>

</body>
</html>