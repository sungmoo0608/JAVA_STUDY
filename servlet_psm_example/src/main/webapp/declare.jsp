<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		int i = 10;
		String words = "ABCDE";
		
		public int sum(int a, int b) {
			return a + b;
		}
	%>
	<%
		out.print(i + "<br>");
		out.print(words + "<br>");
		out.print(sum(3, 5) + "<br>");
	%>
	<hr>
	<%= i %><br>
	<%= words %><br>
	<%= sum(3,5) %><br>
	<hr>
	<%
		int[] iArr = {10,20,30};
		out.println( Arrays.toString(iArr) + "<br>" );
	%>
	<%= iArr %><br>
	<%= "[10,20,30]"%><br>
	<%= Arrays.toString(iArr) %><br>
</body>
</html>