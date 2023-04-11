<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int start=1;
	int result = 0;
	for(int i=start; i<=10; i++){
		result +=i;
	}
	out.print(result);
%>
1부터 10까지 더한 값은 <%=result %> 입니다.
</body>
</html>