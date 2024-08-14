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
		int i=0;
		System.out.println(i);
		out.print("<h1>"+i+"</h1>");
	%>

	<hr>
	<h1>3단</h1>
	<%
		int dan = 3;
		
		for(i=1; i<=9; i++){
			out.print(dan + "*" + i + "=" + dan*i + "<br>" );
		}
	
	%>
	<hr>
	<h1>구구단</h1>
	<%
		int j=0;
	
		for(i=1; i<=9; i++){
			out.println("<h2>"+i+"단</h2>");
			for(j=1; j<=9; j++){
				out.print(j + "*" + i + "=" + j*i + "<br>" );
			}
			out.print("<br>" );
		}
	
	%>
	<hr>
	<h1>구구단 가로 테이블 출력</h1>
	<table border="1">
		<tr>
			<% 
				for(i=1;i<=9;i++){ 
					out.print("<td>" + i + "단" + "</td>" );
				} 
			%>	
		</tr>
		<%
			for(i=1; i<=9; i++){ 
				out.print("<tr>");
					for(j=1; j<=9; j++){
						out.print("<td>" + j + "*" + i + "=" + j*i + "</td>"); 				
					} 
				out.print("</tr>");
			}
		%>
	</table>

	<h1>안녕하세요</h1>

</body>
</html>