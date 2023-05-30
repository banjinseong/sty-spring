<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../header.jsp"%>
<html>
		<h3><b><center>게시물 수정</center></b></h3>
		<form role="form" method="post">
			<div>
				<label>게시물 번호</label>
				<input type="text" value="${boardVO.bno }" readonly="readonly" name="bno">
				<br>			
			</div>
			<div>
				<label>제목</label>
				<input type="text" value="${boardVO.title }" name="title">
				<br>			
			</div>
			<div>
				<label>내용</label>
				<textarea rows="5" name="content">${boardVO.content }</textarea>
				<br>			
			</div>
			<div>
				<label>작성자</label>
				<input type="text" value="${boardVO.writer }" name="bno" readonly="readonly">
				<br>			
			</div>
			<button>저장</button>
		</form>
		<a href="/board/listAll">
			<button>목록보기</button>
		</a>
</html>
<%@include file="../footer.jsp"%>
