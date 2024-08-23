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
	<table border="1" align="center">
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
			
			%>
			<tr>
				<td>사원 번호</td>
				<td>사원 이름</td>
				<td>직종</td>
				<td>매니저</td>
				<td>입사일</td>
				<td>월급</td>
				<td>커밋션</td>
				<td>부서 번호</td>
			</tr>
			
			<%
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate= rs.getString("hiredate");
				int sal = rs.getInt("sal");
				String comm = rs.getString("comm");
				int deptno = rs.getInt("deptno");
				
				out.print("<tr>");
				out.print("<td>" + empno + "</td>");
				out.print("<td>" + ename + "</td>");
				out.print("<td>" + job + "</td>");
				out.print("<td>" + mgr + "</td>");
				out.print("<td>" + hiredate + "</td>");
				out.print("<td>" + sal + "</td>");
				out.print("<td>" + comm + "</td>");
				out.print("<td>" + deptno + "</td>");
				out.print("</tr>");
			}
			
			
		} catch(Exception e){}
		finally{}
	%>
	
	
	</table>
</body>
</html>