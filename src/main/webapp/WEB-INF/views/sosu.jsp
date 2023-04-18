<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>1~1000사이의 소수는?</h2>
<%
	int a;
	int count=0;
	for(int i=2; i<=1000; i++){
		a=i/2;
		for(int j=2; j<=a; j++){
			if(i%j == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			out.print(i+",");
		}
		if(i%100==0)
			out.print("<br>");	
		count=0;
	}
%>

</body>
</html>