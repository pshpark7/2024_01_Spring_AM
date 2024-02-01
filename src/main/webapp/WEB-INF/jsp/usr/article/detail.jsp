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

	<table border="1">
		<thead class="mx-auto">
			<tr>
				<th>번호</th>
				<th>작성일자</th>
				<th>수정일자</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${article.id }</td>

				<td>${article.regDate.substring(0,10)}</td>

				<td>${article.updateDate.substring(0,10) }</td>

				<td>${article.title }</td>

				<td>${article.body }</td>

				<td>${article.nickname }</td>
			</tr>

		</tbody>
	</table>

	<div>
		<a href="doDelete?id=${article.id}">삭제</a>
		<a href="doModify?id=${article.id}">수정</a>
	</div>


</body>
</html>