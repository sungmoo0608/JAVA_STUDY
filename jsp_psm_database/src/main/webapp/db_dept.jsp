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
		Connection connection=null;
		Statement statement=null;
		ResultSet rs=null;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "scott";
		String upw = "tiger";
		
		String query = "select * from dept";
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uid, upw);
			statement = connection.createStatement();
			rs = statement.executeQuery(query);
			
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				out.print("부서 번호 : " + deptno + "&nbsp");
				out.print("부서 이름 : " + dname + "&nbsp");
				out.print("근무 지역 : " + loc + "&nbsp");
				
				out.print("<br>");
			}
			
			
		} catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null){
					rs.close();
				}
				
				if(statement != null){
					statement.close();
				}
				
				if(connection != null){
					connection.close();
				}
				
			} catch(Exception e) {}
		}
	%>
</body>
</html>;