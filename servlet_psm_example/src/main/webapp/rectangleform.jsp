
<%@page import="edu.ict.shape.Rectangle"%>
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
		int width = Integer.valueOf(request.getParameter("width"));
		int height = Integer.valueOf(request.getParameter("height"));
		Rectangle rectangle = new Rectangle(width,height);
	%>
	사각형 가로 : <%= width %><br>
	사각형 세로 : <%= height %><br>
	사각형 넓이 : <%= rectangle.getArea() %><br>
	
</body>
</html>