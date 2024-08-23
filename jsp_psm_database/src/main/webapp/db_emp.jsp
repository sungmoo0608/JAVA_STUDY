<%@page import="java.sql.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection connection;
		Statement statement;
		ResultSet rs;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "scott";
		String upw = "tiger";
		
		String query = "select * from emp";
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate= rs.getString("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				int deptno = rs.getInt("deptno");
				
				out.print("사원 번호 : " + empno + "&nbsp");
				out.print("사원 이름 : " + ename + "&nbsp");
				out.print("직종 : " + job + "&nbsp");
				out.print("매니저 : " + mgr + "&nbsp");
				out.print("입사일 : " + hiredate + "&nbsp");
				out.print("월급 : " + sal + "&nbsp");
				out.print("커밋션 : " + comm + "&nbsp");
				out.print("부서번호 : " + deptno + "&nbsp");
				
				out.print("<br>");
			}
			
			
		} catch(Exception e){}
		finally{}
	%>
</body>
</html>