<%@page import="java.util.Random"%>
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
	Random ran = new Random();
	boolean chk = true;
	int LottoNum = 6;
	int[] Lotto = new int[LottoNum];
	Lotto[0] = ran.nextInt(10)+1;
	for(int i=1; i<LottoNum; i++){
		int a = ran.nextInt(10)+1;
		while(chk){
			for(int j=0; j<i; j++){
				if(Lotto[j]==a){
					a = ran.nextInt(10)+1;
					chk=true;
					break;
				}
				chk = false;
			}
			
		}
		Lotto[i] = a;
		chk=true;
	}
	for(int i=0; i<6; i++){
		out.print(Lotto[i] + "<br>");
	}
%>
</body>
</html>