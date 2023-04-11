<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world!</h1>
<h2 align="center">구구단</h2>
<table border="1">
<%
	for(int i=1; i<=10; i++){
		out.println("<tr align='center'>");
		for(int j=1; j<10; j++){
			out.println("<td>" + j + "*" + i + "=" + i*j + "</td>");
		}
		out.println("</tr>");
	}
%>
</table>
</body>
</html>