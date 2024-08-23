<%@page import="edu.ict.prj.vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="edu.ict.prj.dao.EmpDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Emp 테이블</h1>
	
	<%
	
	EmpDao dao = new EmpDao();

	List<EmpVO> empList = dao.empSelect();

	for (EmpVO vo : empList) {

		out.println("사원번호 : " + vo.getEmpno() + "<br>");
		out.println("이름 : " + vo.getEname() + "<br>");
		out.println("직업 : " + vo.getJob() + "<br>");
		out.println("매니저 : " + vo.getMgr() + "<br>");
		out.println("입사일 : " + vo.getHiredate() + "<br>");
		out.println("급여 : " + vo.getSal() + "<br>");
		out.println("커미션 : " + vo.getComm() + "<br>");
		out.println("부서번호 : " + vo.getDeptno() + "<br>");
		out.println("<hr />");
	}
	
	%>

</body>
</html>