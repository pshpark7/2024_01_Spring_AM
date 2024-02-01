<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ARTICLE DETAIL</title>
</head>
<body>
	<h1>게시물 상세 페이지</h1>

	<hr />
	
	<div>번호 : ${article.id }</div>
	<div>작성일자 : ${article.regDate }</div>
	<div>수정일자 : ${article.updateDate }</div>
	<div>제목 : ${article.title }</div>
	<div>내용 : ${article.body }</div>
	<div>작성자 : ${article.nickname }</div>

	<div>
		<a href="doDelte?id=${article.id}">삭제</a>
		<a href="doModify?id=${article.id}">수정</a>
	</div>





</body>
</html>