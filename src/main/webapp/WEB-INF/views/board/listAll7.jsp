<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>

<%@include file="../header.jsp"%>
<html>
	<h3><center><b>게시물 목록</b></center></h3>
	<table>
		<tr>
			<th style="width: 50px"> BNO
			<th style="width: 300px"> 제목
			<th style="width: 300px"> 글쓴이
			<th style="width: 200px"> 등록시간
			<th style="width: 50px"> 조회수
		</tr>
		<c:forEach items="${list }" var="boardVO">
			<tr>
				<td>${boardVO.bno }
				<td><a href="/board/read?bno=${boardVO.bno }">${boardVO.title }</a> 
				<td>${boardVO.writer }
				<td><fmt:formatDate value="${boardVO.regdate }" pattern="yyyy-MM-dd HH:mm"/> 
				<td>${boardVO.viewcnt }
			</tr>
		</c:forEach>
	</table>
</html>
<%@include file="../footer.jsp"%>
